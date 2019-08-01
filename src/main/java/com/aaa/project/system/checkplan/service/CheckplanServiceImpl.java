package com.aaa.project.system.checkplan.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.checkplan.mapper.CheckplanMapper;
import com.aaa.project.system.checkplan.domain.Checkplan;
import com.aaa.project.system.checkplan.service.ICheckplanService;
import com.aaa.common.support.Convert;

/**
 * 计划审核 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
@Service
public class CheckplanServiceImpl implements ICheckplanService 
{
	@Autowired
	private CheckplanMapper checkplanMapper;

	/**
     * 查询计划审核信息
     * 
     * @param checkId 计划审核ID
     * @return 计划审核信息
     */
    @Override
	public Checkplan selectCheckplanById(Integer checkId)
	{
	    return checkplanMapper.selectCheckplanById(checkId);
	}
	
	/**
     * 查询计划审核列表
     * 
     * @param checkplan 计划审核信息
     * @return 计划审核集合
     */
	@Override
	public List<Checkplan> selectCheckplanList(Checkplan checkplan)
	{
	    return checkplanMapper.selectCheckplanList(checkplan);
	}
	
    /**
     * 新增计划审核
     * 
     * @param checkplan 计划审核信息
     * @return 结果
     */
	@Override
	public int insertCheckplan(Checkplan checkplan)
	{
	    return checkplanMapper.insertCheckplan(checkplan);
	}
	
	/**
     * 修改计划审核
     * 
     * @param checkplan 计划审核信息
     * @return 结果
     */
	@Override
	public int updateCheckplan(Checkplan checkplan)
	{
	    return checkplanMapper.updateCheckplan(checkplan);
	}

	/**
     * 删除计划审核对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCheckplanByIds(String ids)
	{
		return checkplanMapper.deleteCheckplanByIds(Convert.toStrArray(ids));
	}
	
}
