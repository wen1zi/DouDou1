package com.aaa.project.system.plans.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.plans.mapper.PlansMapper;
import com.aaa.project.system.plans.domain.Plans;
import com.aaa.project.system.plans.service.IPlansService;
import com.aaa.common.support.Convert;

/**
 * 代维计划 服务层实现
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Service
public class PlansServiceImpl implements IPlansService 
{
	@Autowired
	private PlansMapper plansMapper;

	/**
     * 查询代维计划信息
     * 
     * @param planId 代维计划ID
     * @return 代维计划信息
     */
    @Override
	public Plans selectPlansById(Integer planId)
	{
	    return plansMapper.selectPlansById(planId);
	}
	
	/**
     * 查询代维计划列表
     * 
     * @param plans 代维计划信息
     * @return 代维计划集合
     */
	@Override
	public List<Plans> selectPlansList(Plans plans)
	{
	    return plansMapper.selectPlansList(plans);
	}
	
    /**
     * 新增代维计划
     * 
     * @param plans 代维计划信息
     * @return 结果
     */
	@Override
	public int insertPlans(Plans plans)
	{
	    return plansMapper.insertPlans(plans);
	}
	
	/**
     * 修改代维计划
     * 
     * @param plans 代维计划信息
     * @return 结果
     */
	@Override
	public int updatePlans(Plans plans)
	{
	    return plansMapper.updatePlans(plans);
	}

	/**
     * 删除代维计划对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePlansByIds(String ids)
	{
		return plansMapper.deletePlansByIds(Convert.toStrArray(ids));
	}
	
}
