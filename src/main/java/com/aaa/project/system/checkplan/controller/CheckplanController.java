package com.aaa.project.system.checkplan.controller;

import java.util.ArrayList;
import java.util.List;

import com.aaa.project.system.plans.domain.Plans;
import com.aaa.project.system.plans.service.IPlansService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.aaa.framework.aspectj.lang.annotation.Log;
import com.aaa.framework.aspectj.lang.enums.BusinessType;
import com.aaa.project.system.checkplan.domain.Checkplan;
import com.aaa.project.system.checkplan.service.ICheckplanService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 计划审核 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
@Controller
@RequestMapping("/system/checkplan")
public class CheckplanController extends BaseController
{
    private String prefix = "system/checkplan";
	
	@Autowired
	private ICheckplanService checkplanService;
	@Autowired
	private IPlansService plansService;
	
	@RequiresPermissions("system:checkplan:view")
	@GetMapping()
	public String checkplan()
	{
	    return prefix + "/checkplan";
	}
	
	/**
	 * 查询计划审核列表
	 */
	@RequiresPermissions("system:checkplan:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Checkplan checkplan)
	{

		startPage();
		List<Checkplan> list = checkplanService.selectCheckplanList(checkplan);
		List<Checkplan> checkplans = new ArrayList<Checkplan>();

		for (Checkplan check :list) {
			Plans plans = plansService.selectPlansById(check.getPlanId());
			check.setPlans(plans);
			if (!plans.getPlanResult().equals("0")){
				checkplans.add(check);
			}
		}
		return getDataTable(checkplans);
	}
	
	
	/**
	 * 导出计划审核列表
	 */
	@RequiresPermissions("system:checkplan:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Checkplan checkplan)
    {
    	List<Checkplan> list = checkplanService.selectCheckplanList(checkplan);
        ExcelUtil<Checkplan> util = new ExcelUtil<Checkplan>(Checkplan.class);
        return util.exportExcel(list, "checkplan");
    }
	
	/**
	 * 新增计划审核
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存计划审核
	 */
	@RequiresPermissions("system:checkplan:add")
	@Log(title = "计划审核", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Checkplan checkplan)
	{		
		return toAjax(checkplanService.insertCheckplan(checkplan));
	}

	/**
	 * 修改计划审核
	 */
	@GetMapping("/edit/{checkId}")
	public String edit(@PathVariable("checkId") Integer checkId, ModelMap mmap)
	{
		Checkplan checkplan = checkplanService.selectCheckplanById(checkId);
		mmap.put("checkplan", checkplan);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存计划审核
	 */
	@RequiresPermissions("system:checkplan:edit")
	@Log(title = "计划审核", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Checkplan checkplan)
	{		
		return toAjax(checkplanService.updateCheckplan(checkplan));
	}
	
	/**
	 * 删除计划审核
	 */
	@RequiresPermissions("system:checkplan:remove")
	@Log(title = "计划审核", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(checkplanService.deleteCheckplanByIds(ids));
	}


	@GetMapping("/check/{checkId}")
	public String check(@PathVariable("checkId") Integer checkId, ModelMap mmap)
	{
		Checkplan checkplan = checkplanService.selectCheckplanById(checkId);
		mmap.put("checkplan", checkplan);
		return prefix + "/check";
	}
	@RequiresPermissions("system:checkplan:check")
	@Log(title = "计划审核", businessType = BusinessType.DELETE)
	@PostMapping( "/check")
	@ResponseBody
	public AjaxResult checkSave(Integer checkId,String status,String context)
	{
		Checkplan checkplan = checkplanService.selectCheckplanById(checkId);
		Plans plans = plansService.selectPlansById(checkId);
		if (status != null && status.equals("on")){
			plans.setPlanResult("2");
		}else{
			plans.setPlanResult("3");
		}
		checkplan.setCheckReasons(context);
		checkplanService.updateCheckplan(checkplan);
		return toAjax(plansService.updatePlans(plans));
	}
	
}
