package com.aaa.project.system.taskinfo.controller;

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
import com.aaa.project.system.taskinfo.domain.Taskinfo;
import com.aaa.project.system.taskinfo.service.ITaskinfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 巡检资源关系 信息操作处理
 * 
 * @author toneySong
 * @date 2019-08-01
 */
@Controller
@RequestMapping("/system/taskinfo")
public class TaskinfoController extends BaseController
{
    private String prefix = "system/taskinfo";
	
	@Autowired
	private ITaskinfoService taskinfoService;
	
	@RequiresPermissions("system:taskinfo:view")
	@GetMapping()
	public String taskinfo()
	{
	    return prefix + "/taskinfo";
	}
	
	/**
	 * 查询巡检资源关系列表
	 */
	@RequiresPermissions("system:taskinfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Taskinfo taskinfo)
	{
		startPage();
        List<Taskinfo> list = taskinfoService.selectTaskinfoList(taskinfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出巡检资源关系列表
	 */
	@RequiresPermissions("system:taskinfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Taskinfo taskinfo)
    {
    	List<Taskinfo> list = taskinfoService.selectTaskinfoList(taskinfo);
        ExcelUtil<Taskinfo> util = new ExcelUtil<Taskinfo>(Taskinfo.class);
        return util.exportExcel(list, "taskinfo");
    }
	
	/**
	 * 新增巡检资源关系
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存巡检资源关系
	 */
	@RequiresPermissions("system:taskinfo:add")
	@Log(title = "巡检资源关系", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Taskinfo taskinfo)
	{		
		return toAjax(taskinfoService.insertTaskinfo(taskinfo));
	}

	/**
	 * 修改巡检资源关系
	 */
	@GetMapping("/edit/{taskNum}")
	public String edit(@PathVariable("taskNum") Integer taskNum, ModelMap mmap)
	{
		Taskinfo taskinfo = taskinfoService.selectTaskinfoById(taskNum);
		mmap.put("taskinfo", taskinfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存巡检资源关系
	 */
	@RequiresPermissions("system:taskinfo:edit")
	@Log(title = "巡检资源关系", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Taskinfo taskinfo)
	{		
		return toAjax(taskinfoService.updateTaskinfo(taskinfo));
	}
	
	/**
	 * 删除巡检资源关系
	 */
	@RequiresPermissions("system:taskinfo:remove")
	@Log(title = "巡检资源关系", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(taskinfoService.deleteTaskinfoByIds(ids));
	}
	
}
