package com.aaa.project.system.networkresource.controller;

import com.aaa.common.utils.poi.ExcelUtil;
import com.aaa.framework.aspectj.lang.annotation.Log;
import com.aaa.framework.aspectj.lang.enums.BusinessType;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.project.system.networkresource.domain.Networkresource;
import com.aaa.project.system.networkresource.service.INetworkresourceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 网络资源 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Controller
@RequestMapping("/system/networkresource")
public class NetworkresourceController extends BaseController
{
    private String prefix = "system/networkresource";
	
	@Autowired
	private INetworkresourceService networkresourceService;
	
	@RequiresPermissions("system:networkresource:view")
	@GetMapping()
	public String networkresource()
	{
	    return prefix + "/networkresource";
	}
	
	/**
	 * 查询网络资源列表
	 */
	@RequiresPermissions("system:networkresource:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Networkresource networkresource)
	{
		networkresource.setEnable(1);
		startPage();
        List<Networkresource> list = networkresourceService.selectNetworkresourceList(networkresource);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出网络资源列表
	 */
	@RequiresPermissions("system:networkresource:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Networkresource networkresource)
    {
    	List<Networkresource> list = networkresourceService.selectNetworkresourceList(networkresource);
        ExcelUtil<Networkresource> util = new ExcelUtil<Networkresource>(Networkresource.class);
        return util.exportExcel(list, "networkresource");
    }
	
	/**
	 * 新增网络资源
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存网络资源
	 */
	@RequiresPermissions("system:networkresource:add")
	@Log(title = "网络资源", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Networkresource networkresource)
	{		
		return toAjax(networkresourceService.insertNetworkresource(networkresource));
	}

	/**
	 * 修改网络资源
	 */
	@GetMapping("/edit/{resId}")
	public String edit(@PathVariable("resId") Integer resId, ModelMap mmap)
	{
		Networkresource networkresource = networkresourceService.selectNetworkresourceById(resId);
		mmap.put("networkresource", networkresource);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存网络资源
	 */
	@RequiresPermissions("system:networkresource:edit")
	@Log(title = "网络资源", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Networkresource networkresource)
	{		
		return toAjax(networkresourceService.updateNetworkresource(networkresource));
	}
	
	/**
	 * 删除网络资源
	 */
	@RequiresPermissions("system:networkresource:remove")
	@Log(title = "网络资源", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)

	{
		return toAjax(networkresourceService.deleteNetworkresourceByIds(ids));
	}
	
}
