package com.aaa.project.system.company.controller;

import com.aaa.common.utils.poi.ExcelUtil;
import com.aaa.framework.aspectj.lang.annotation.Log;
import com.aaa.framework.aspectj.lang.enums.BusinessType;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.project.system.company.domain.Company;
import com.aaa.project.system.company.service.ICompanyService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 代维公司 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Controller
@RequestMapping("/system/company")
public class CompanyController extends BaseController
{
    private String prefix = "system/company";
	
	@Autowired
	private ICompanyService companyService;
	
	@RequiresPermissions("system:company:view")
	@GetMapping()
	public String company()
	{
	    return prefix + "/company";
	}
	
	/**
	 * 查询代维公司列表
	 */
	@RequiresPermissions("system:company:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Company company)
	{
		startPage();
        List<Company> list = companyService.selectCompanyList(company);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出代维公司列表
	 */
	@RequiresPermissions("system:company:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Company company)
    {
    	List<Company> list = companyService.selectCompanyList(company);
        ExcelUtil<Company> util = new ExcelUtil<Company>(Company.class);
        return util.exportExcel(list, "company");
    }
	
	/**
	 * 新增代维公司
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存代维公司
	 */
	@RequiresPermissions("system:company:add")
	@Log(title = "代维公司", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Company company)
	{		
		return toAjax(companyService.insertCompany(company));
	}

	/**
	 * 修改代维公司
	 */
	@GetMapping("/edit/{comid}")
	public String edit(@PathVariable("comid") Integer comid, ModelMap mmap)
	{
		Company company = companyService.selectCompanyById(comid);
		mmap.put("company", company);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存代维公司
	 */
	@RequiresPermissions("system:company:edit")
	@Log(title = "代维公司", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Company company)
	{		
		return toAjax(companyService.updateCompany(company));
	}
	
	/**
	 * 删除代维公司
	 */
	@RequiresPermissions("system:company:remove")
	@Log(title = "代维公司", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(companyService.deleteCompanyByIds(ids));
	}
	
}
