package com.aaa.project.system.template.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 模版管理表 template
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class Template extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 模版编号 */
	private Integer templateId;
	/** 模版名称 */
	private String templateName;
	/** 规范编号 */
	private Integer standardId;
	/** 模版概述 */
	private String templateDescribe;
	/** 模版制作单位 */
	private String templateComp;
	/** 模版制作人 */
	private String templateMake;
	/** 模版制作时间 */
	private Date templateTime;

	public void setTemplateId(Integer templateId) 
	{
		this.templateId = templateId;
	}

	public Integer getTemplateId() 
	{
		return templateId;
	}
	public void setTemplateName(String templateName) 
	{
		this.templateName = templateName;
	}

	public String getTemplateName() 
	{
		return templateName;
	}
	public void setStandardId(Integer standardId) 
	{
		this.standardId = standardId;
	}

	public Integer getStandardId() 
	{
		return standardId;
	}
	public void setTemplateDescribe(String templateDescribe) 
	{
		this.templateDescribe = templateDescribe;
	}

	public String getTemplateDescribe() 
	{
		return templateDescribe;
	}
	public void setTemplateComp(String templateComp) 
	{
		this.templateComp = templateComp;
	}

	public String getTemplateComp() 
	{
		return templateComp;
	}
	public void setTemplateMake(String templateMake) 
	{
		this.templateMake = templateMake;
	}

	public String getTemplateMake() 
	{
		return templateMake;
	}
	public void setTemplateTime(Date templateTime) 
	{
		this.templateTime = templateTime;
	}

	public Date getTemplateTime() 
	{
		return templateTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("templateId", getTemplateId())
            .append("templateName", getTemplateName())
            .append("standardId", getStandardId())
            .append("templateDescribe", getTemplateDescribe())
            .append("templateComp", getTemplateComp())
            .append("templateMake", getTemplateMake())
            .append("templateTime", getTemplateTime())
            .toString();
    }
}
