package com.aaa.project.system.template.mapper;

import com.aaa.project.system.template.domain.Template;
import java.util.List;	

/**
 * 模版管理 数据层
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public interface TemplateMapper 
{
	/**
     * 查询模版管理信息
     * 
     * @param templateId 模版管理ID
     * @return 模版管理信息
     */
	public Template selectTemplateById(Integer templateId);
	
	/**
     * 查询模版管理列表
     * 
     * @param template 模版管理信息
     * @return 模版管理集合
     */
	public List<Template> selectTemplateList(Template template);
	
	/**
     * 新增模版管理
     * 
     * @param template 模版管理信息
     * @return 结果
     */
	public int insertTemplate(Template template);
	
	/**
     * 修改模版管理
     * 
     * @param template 模版管理信息
     * @return 结果
     */
	public int updateTemplate(Template template);
	
	/**
     * 删除模版管理
     * 
     * @param templateId 模版管理ID
     * @return 结果
     */
	public int deleteTemplateById(Integer templateId);
	
	/**
     * 批量删除模版管理
     * 
     * @param templateIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTemplateByIds(String[] templateIds);
	
}