package com.aaa.project.system.company.service;

import com.aaa.common.support.Convert;
import com.aaa.project.system.company.domain.Company;
import com.aaa.project.system.company.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 代维公司 服务层实现
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Service
public class CompanyServiceImpl implements ICompanyService 
{
	@Autowired
	private CompanyMapper companyMapper;

	/**
     * 查询代维公司信息
     * 
     * @param comid 代维公司ID
     * @return 代维公司信息
     */
    @Override
	public Company selectCompanyById(Integer comid)
	{
	    return companyMapper.selectCompanyById(comid);
	}
	
	/**
     * 查询代维公司列表
     * 
     * @param company 代维公司信息
     * @return 代维公司集合
     */
	@Override
	public List<Company> selectCompanyList(Company company)
	{
	    return companyMapper.selectCompanyList(company);
	}
	
    /**
     * 新增代维公司
     * 
     * @param company 代维公司信息
     * @return 结果
     */
	@Override
	public int insertCompany(Company company)
	{
	    return companyMapper.insertCompany(company);
	}
	
	/**
     * 修改代维公司
     * 
     * @param company 代维公司信息
     * @return 结果
     */
	@Override
	public int updateCompany(Company company)
	{
	    return companyMapper.updateCompany(company);
	}

	/**
     * 删除代维公司对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCompanyByIds(String ids)
	{
		return companyMapper.deleteCompanyByIds(Convert.toStrArray(ids));
	}
	
}
