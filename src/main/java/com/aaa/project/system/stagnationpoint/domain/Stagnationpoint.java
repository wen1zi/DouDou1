package com.aaa.project.system.stagnationpoint.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 驻点管理表 stagnationpoint
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class Stagnationpoint extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 驻点编号 */
	private Integer stagId;
	/** 驻点名称 */
	private String stagName;
	/** 上级 */
	private Integer comid;
	/** 驻点地址 */
	private String stagAddress;
	/** 驻点负责人 */
	private String stagMan;
	/** 驻点人联系方式 */
	private String stagPhone;
	/** 巡检资源数量 */
	private Integer stagCount;

	public void setStagId(Integer stagId) 
	{
		this.stagId = stagId;
	}

	public Integer getStagId() 
	{
		return stagId;
	}
	public void setStagName(String stagName) 
	{
		this.stagName = stagName;
	}

	public String getStagName() 
	{
		return stagName;
	}
	public void setComid(Integer comid) 
	{
		this.comid = comid;
	}

	public Integer getComid() 
	{
		return comid;
	}
	public void setStagAddress(String stagAddress) 
	{
		this.stagAddress = stagAddress;
	}

	public String getStagAddress() 
	{
		return stagAddress;
	}
	public void setStagMan(String stagMan) 
	{
		this.stagMan = stagMan;
	}

	public String getStagMan() 
	{
		return stagMan;
	}
	public void setStagPhone(String stagPhone) 
	{
		this.stagPhone = stagPhone;
	}

	public String getStagPhone() 
	{
		return stagPhone;
	}
	public void setStagCount(Integer stagCount) 
	{
		this.stagCount = stagCount;
	}

	public Integer getStagCount() 
	{
		return stagCount;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stagId", getStagId())
            .append("stagName", getStagName())
            .append("comid", getComid())
            .append("stagAddress", getStagAddress())
            .append("stagMan", getStagMan())
            .append("stagPhone", getStagPhone())
            .append("stagCount", getStagCount())
            .toString();
    }
}
