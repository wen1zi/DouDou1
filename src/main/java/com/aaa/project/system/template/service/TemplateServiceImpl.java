package com.aaa.project.system.template.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.template.mapper.TemplateMapper;
import com.aaa.project.system.template.domain.Template;
import com.aaa.project.system.template.service.ITemplateService;
import com.aaa.common.support.Convert;

/**
 * 模版管理 服务层实现
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Service("templateServiceImpl")
public class TemplateServiceImpl implements ITemplateService 
{
	@Autowired
	private TemplateMapper templateMapper;

	/**
     * 查询模版管理信息
     * 
     * @param templateId 模版管理ID
     * @return 模版管理信息
     */
    @Override
	public Template selectTemplateById(Integer templateId)
	{
	    return templateMapper.selectTemplateById(templateId);
	}
	
	/**
     * 查询模版管理列表
     * 
     * @param template 模版管理信息
     * @return 模版管理集合
     */
	@Override
	public List<Template> selectTemplateList(Template template)
	{
	    return templateMapper.selectTemplateList(template);
	}
	
    /**
     * 新增模版管理
     * 
     * @param template 模版管理信息
     * @return 结果
     */
	@Override
	public int insertTemplate(Template template)
	{
	    return templateMapper.insertTemplate(template);
	}
	
	/**
     * 修改模版管理
     * 
     * @param template 模版管理信息
     * @return 结果
     */
	@Override
	public int updateTemplate(Template template)
	{
	    return templateMapper.updateTemplate(template);
	}

	/**
     * 删除模版管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTemplateByIds(String ids)
	{
		return templateMapper.deleteTemplateByIds(Convert.toStrArray(ids));
	}
	
}
