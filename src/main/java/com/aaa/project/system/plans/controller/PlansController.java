package com.aaa.project.system.plans.controller;

import java.util.List;
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
import com.aaa.project.system.plans.domain.Plans;
import com.aaa.project.system.plans.service.IPlansService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 代维计划 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Controller
@RequestMapping("/system/plans")
public class PlansController extends BaseController
{
    private String prefix = "system/plans";
	
	@Autowired
	private IPlansService plansService;
	
	@RequiresPermissions("system:plans:view")
	@GetMapping()
	public String plans()
	{
	    return prefix + "/plans";
	}
	
	/**
	 * 查询代维计划列表
	 */
	@RequiresPermissions("system:plans:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Plans plans)
	{
		startPage();
        List<Plans> list = plansService.selectPlansList(plans);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出代维计划列表
	 */
	@RequiresPermissions("system:plans:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Plans plans)
    {
    	List<Plans> list = plansService.selectPlansList(plans);
        ExcelUtil<Plans> util = new ExcelUtil<Plans>(Plans.class);
        return util.exportExcel(list, "plans");
    }
	
	/**
	 * 新增代维计划
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存代维计划
	 */
	@RequiresPermissions("system:plans:add")
	@Log(title = "代维计划", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Plans plans)
	{		
		return toAjax(plansService.insertPlans(plans));
	}

	/**
	 * 修改代维计划
	 */
	@GetMapping("/edit/{planId}")
	public String edit(@PathVariable("planId") Integer planId, ModelMap mmap)
	{
		Plans plans = plansService.selectPlansById(planId);
		mmap.put("plans", plans);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存代维计划
	 */
	@RequiresPermissions("system:plans:edit")
	@Log(title = "代维计划", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Plans plans)
	{		
		return toAjax(plansService.updatePlans(plans));
	}
	
	/**
	 * 删除代维计划
	 */
	@RequiresPermissions("system:plans:remove")
	@Log(title = "代维计划", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(plansService.deletePlansByIds(ids));
	}
	
}
