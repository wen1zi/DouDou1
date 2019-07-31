package com.aaa.project.system.standard.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 资源管理规范表 standard
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class Standard extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 规范编号 */
	private Integer standardId;
	/** 资源id号 */
	private String resId;
	/** 巡检项目 */
	private String standardEvent;
	/** 巡检内容 */
	private String standardContent;
	/** 巡检周期 */
	private String standardCycle;
	/** 巡检开始实施时间 */
	private Date standardTime;

	public void setStandardId(Integer standardId) 
	{
		this.standardId = standardId;
	}

	public Integer getStandardId() 
	{
		return standardId;
	}
	public void setResId(String resId) 
	{
		this.resId = resId;
	}

	public String getResId() 
	{
		return resId;
	}
	public void setStandardEvent(String standardEvent) 
	{
		this.standardEvent = standardEvent;
	}

	public String getStandardEvent() 
	{
		return standardEvent;
	}
	public void setStandardContent(String standardContent) 
	{
		this.standardContent = standardContent;
	}

	public String getStandardContent() 
	{
		return standardContent;
	}
	public void setStandardCycle(String standardCycle) 
	{
		this.standardCycle = standardCycle;
	}

	public String getStandardCycle() 
	{
		return standardCycle;
	}
	public void setStandardTime(Date standardTime) 
	{
		this.standardTime = standardTime;
	}

	public Date getStandardTime() 
	{
		return standardTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("standardId", getStandardId())
            .append("resId", getResId())
            .append("standardEvent", getStandardEvent())
            .append("standardContent", getStandardContent())
            .append("standardCycle", getStandardCycle())
            .append("standardTime", getStandardTime())
            .toString();
    }
}
