package com.aaa.project.system.networkresource.service;

import com.aaa.project.system.networkresource.domain.Networkresource;

import java.util.List;

/**
 * 网络资源 服务层
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public interface INetworkresourceService 
{
	/**
     * 查询网络资源信息
     * 
     * @param resId 网络资源ID
     * @return 网络资源信息
     */
	public Networkresource selectNetworkresourceById(Integer resId);
	
	/**
     * 查询网络资源列表
     * 
     * @param networkresource 网络资源信息
     * @return 网络资源集合
     */
	public List<Networkresource> selectNetworkresourceList(Networkresource networkresource);
	
	/**
     * 新增网络资源
     * 
     * @param networkresource 网络资源信息
     * @return 结果
     */
	public int insertNetworkresource(Networkresource networkresource);
	
	/**
     * 修改网络资源
     * 
     * @param networkresource 网络资源信息
     * @return 结果
     */
	public int updateNetworkresource(Networkresource networkresource);
		
	/**
     * 删除网络资源信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteNetworkresourceByIds(String ids);
	
}
