package com.aaa.project.system.plans.domain;

import com.aaa.project.system.networkresource.domain.Networkresource;
import com.aaa.project.system.stagnationpoint.domain.Stagnationpoint;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 代维计划表 plans
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class Plans extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 计划编号 */
	private Integer planId;
	/** 计划名称 */
	private String planName;
	/** 发送人 */
	private String planAuthor;
	/** 制定时间 */
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8:00")
	private Date planTime;
	/** 资源id */
	private Integer resId;
	/** 代维驻点 */
	private Integer stagId;
	/** 审核结果 */
	private String planResult;
	/** 模板编号 */
	private Integer templateId;

	public void setPlanId(Integer planId)
	{
		this.planId = planId;
	}

	public Integer getPlanId() 
	{
		return planId;
	}
	public void setPlanName(String planName) 
	{
		this.planName = planName;
	}

	public String getPlanName() 
	{
		return planName;
	}
	public void setPlanAuthor(String planAuthor) 
	{
		this.planAuthor = planAuthor;
	}

	public String getPlanAuthor() 
	{
		return planAuthor;
	}
	public void setPlanTime(Date planTime) 
	{
		this.planTime = planTime;
	}

	public Date getPlanTime() 
	{
		return planTime;
	}
	public void setResId(Integer resId) 
	{
		this.resId = resId;
	}

	public Integer getResId() 
	{
		return resId;
	}
	public void setStagId(Integer stagId) 
	{
		this.stagId = stagId;
	}

	public Integer getStagId() 
	{
		return stagId;
	}
	public void setPlanResult(String planResult) 
	{
		this.planResult = planResult;
	}

	public String getPlanResult() 
	{
		return planResult;
	}
	public void setTemplateId(Integer templateId) 
	{
		this.templateId = templateId;
	}

	public Integer getTemplateId() 
	{
		return templateId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("planId", getPlanId())
            .append("planName", getPlanName())
            .append("planAuthor", getPlanAuthor())
            .append("planTime", getPlanTime())
            .append("resId", getResId())
            .append("stagId", getStagId())
            .append("planResult", getPlanResult())
            .append("templateId", getTemplateId())
            .toString();
    }
}
