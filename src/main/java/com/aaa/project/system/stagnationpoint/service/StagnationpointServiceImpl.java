package com.aaa.project.system.stagnationpoint.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.stagnationpoint.mapper.StagnationpointMapper;
import com.aaa.project.system.stagnationpoint.domain.Stagnationpoint;
import com.aaa.project.system.stagnationpoint.service.IStagnationpointService;
import com.aaa.common.support.Convert;

/**
 * 驻点管理 服务层实现
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Service
public class StagnationpointServiceImpl implements IStagnationpointService 
{
	@Autowired
	private StagnationpointMapper stagnationpointMapper;

	/**
     * 查询驻点管理信息
     * 
     * @param stagId 驻点管理ID
     * @return 驻点管理信息
     */
    @Override
	public Stagnationpoint selectStagnationpointById(Integer stagId)
	{
	    return stagnationpointMapper.selectStagnationpointById(stagId);
	}
	
	/**
     * 查询驻点管理列表
     * 
     * @param stagnationpoint 驻点管理信息
     * @return 驻点管理集合
     */
	@Override
	public List<Stagnationpoint> selectStagnationpointList(Stagnationpoint stagnationpoint)
	{
	    return stagnationpointMapper.selectStagnationpointList(stagnationpoint);
	}
	
    /**
     * 新增驻点管理
     * 
     * @param stagnationpoint 驻点管理信息
     * @return 结果
     */
	@Override
	public int insertStagnationpoint(Stagnationpoint stagnationpoint)
	{
	    return stagnationpointMapper.insertStagnationpoint(stagnationpoint);
	}
	
	/**
     * 修改驻点管理
     * 
     * @param stagnationpoint 驻点管理信息
     * @return 结果
     */
	@Override
	public int updateStagnationpoint(Stagnationpoint stagnationpoint)
	{
	    return stagnationpointMapper.updateStagnationpoint(stagnationpoint);
	}

	/**
     * 删除驻点管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStagnationpointByIds(String ids)
	{
		return stagnationpointMapper.deleteStagnationpointByIds(Convert.toStrArray(ids));
	}
	
}
