package com.aaa.project.system.company.service;

import com.aaa.project.system.company.domain.Company;

import java.util.List;

/**
 * 代维公司 服务层
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public interface ICompanyService 
{
	/**
     * 查询代维公司信息
     * 
     * @param comid 代维公司ID
     * @return 代维公司信息
     */
	public Company selectCompanyById(Integer comid);
	
	/**
     * 查询代维公司列表
     * 
     * @param company 代维公司信息
     * @return 代维公司集合
     */
	public List<Company> selectCompanyList(Company company);
	
	/**
     * 新增代维公司
     * 
     * @param company 代维公司信息
     * @return 结果
     */
	public int insertCompany(Company company);
	
	/**
     * 修改代维公司
     * 
     * @param company 代维公司信息
     * @return 结果
     */
	public int updateCompany(Company company);
		
	/**
     * 删除代维公司信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCompanyByIds(String ids);
	
}
