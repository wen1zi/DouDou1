package com.aaa.project.system.checkplan.mapper;

import com.aaa.project.system.checkplan.domain.Checkplan;
import java.util.List;	

/**
 * 计划审核 数据层
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
public interface CheckplanMapper 
{
	/**
     * 查询计划审核信息
     * 
     * @param checkId 计划审核ID
     * @return 计划审核信息
     */
	public Checkplan selectCheckplanById(Integer checkId);
	
	/**
     * 查询计划审核列表
     * 
     * @param checkplan 计划审核信息
     * @return 计划审核集合
     */
	public List<Checkplan> selectCheckplanList(Checkplan checkplan);
	
	/**
     * 新增计划审核
     * 
     * @param checkplan 计划审核信息
     * @return 结果
     */
	public int insertCheckplan(Checkplan checkplan);
	
	/**
     * 修改计划审核
     * 
     * @param checkplan 计划审核信息
     * @return 结果
     */
	public int updateCheckplan(Checkplan checkplan);
	
	/**
     * 删除计划审核
     * 
     * @param checkId 计划审核ID
     * @return 结果
     */
	public int deleteCheckplanById(Integer checkId);
	
	/**
     * 批量删除计划审核
     * 
     * @param checkIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteCheckplanByIds(String[] checkIds);
	
}