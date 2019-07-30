package com.aaa.project.system.company.domain;

import com.aaa.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 代维公司表 company
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class Company extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 序号 */
	private Integer comid;
	/** 公司名称 */
	private String comname;
	/** 公司详细地址 */
	private String comaddress;
	/** 公司负责人 */
	private String comman;
	/** 联系方式 */
	private String comphone;
	/** 公司代维业务 */
	private String comwork;
	/** 代维业绩 */
	private Integer comperformance;
	/** 公司所在市 */
	private String comcity;
	/** 公司所在县 */
	private String comcounty;

	public void setComid(Integer comid) 
	{
		this.comid = comid;
	}

	public Integer getComid() 
	{
		return comid;
	}
	public void setComname(String comname) 
	{
		this.comname = comname;
	}

	public String getComname() 
	{
		return comname;
	}
	public void setComaddress(String comaddress) 
	{
		this.comaddress = comaddress;
	}

	public String getComaddress() 
	{
		return comaddress;
	}
	public void setComman(String comman) 
	{
		this.comman = comman;
	}

	public String getComman() 
	{
		return comman;
	}
	public void setComphone(String comphone) 
	{
		this.comphone = comphone;
	}

	public String getComphone() 
	{
		return comphone;
	}
	public void setComwork(String comwork) 
	{
		this.comwork = comwork;
	}

	public String getComwork() 
	{
		return comwork;
	}
	public void setComperformance(Integer comperformance) 
	{
		this.comperformance = comperformance;
	}

	public Integer getComperformance() 
	{
		return comperformance;
	}
	public void setComcity(String comcity) 
	{
		this.comcity = comcity;
	}

	public String getComcity() 
	{
		return comcity;
	}
	public void setComcounty(String comcounty) 
	{
		this.comcounty = comcounty;
	}

	public String getComcounty() 
	{
		return comcounty;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("comid", getComid())
            .append("comname", getComname())
            .append("comaddress", getComaddress())
            .append("comman", getComman())
            .append("comphone", getComphone())
            .append("comwork", getComwork())
            .append("comperformance", getComperformance())
            .append("comcity", getComcity())
            .append("comcounty", getComcounty())
            .toString();
    }
}
