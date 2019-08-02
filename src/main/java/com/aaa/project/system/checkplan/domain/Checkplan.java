package com.aaa.project.system.checkplan.domain;

import com.aaa.project.system.plans.domain.Plans;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 计划审核表 checkplan
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
public class Checkplan extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 序列号 */
	private Integer checkId;
	/** 计划编号 */
	private Integer planId;
	/** 审核人 */
	private String checkMan;
	/** 审核时间 */
	private Date checkTime;
	/** 审核原因 */
	private String checkReasons;

	private Plans plans;

	public Plans getPlans() {
		return plans;
	}

	public void setPlans(Plans plans) {
		this.plans = plans;
	}

	public void setCheckId(Integer checkId)
	{
		this.checkId = checkId;
	}

	public Integer getCheckId() 
	{
		return checkId;
	}
	public void setPlanId(Integer planId)
	{
		this.planId = planId;
	}

	public Integer getPlanId()
	{
		return planId;
	}
	public void setCheckMan(String checkMan) 
	{
		this.checkMan = checkMan;
	}

	public String getCheckMan() 
	{
		return checkMan;
	}
	public void setCheckTime(Date checkTime) 
	{
		this.checkTime = checkTime;
	}

	public Date getCheckTime() 
	{
		return checkTime;
	}
	public void setCheckReasons(String checkReasons) 
	{
		this.checkReasons = checkReasons;
	}

	public String getCheckReasons() 
	{
		return checkReasons;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("checkId", getCheckId())
            .append("planId", getPlanId())
            .append("checkMan", getCheckMan())
            .append("checkTime", getCheckTime())
            .append("checkReasons", getCheckReasons())
            .toString();
    }
}
