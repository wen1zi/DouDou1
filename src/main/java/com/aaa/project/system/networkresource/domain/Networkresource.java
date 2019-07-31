package com.aaa.project.system.networkresource.domain;

import com.aaa.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 网络资源表 networkresource
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class Networkresource extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 资源id号 */
	private Integer resId;
	/** 资源名称 */
	private String resName;
	/** 维护资源类型 */
	private String resType;
	/** 资源所在市 */
	private String resCity;
	/** 资源所在县（区） */
	private String resCounty;
	/** 代维驻点 */
	private String stagId;
	/** 入网时间 */
	private Date resTime;
	/** 经度 */
	private Float longitude;
	/** 纬度 */
	private Float latitude;
	/** 是否禁用 */
	private Integer enable;

	public void setResId(Integer resId) 
	{
		this.resId = resId;
	}

	public Integer getResId() 
	{
		return resId;
	}
	public void setResName(String resName) 
	{
		this.resName = resName;
	}

	public String getResName() 
	{
		return resName;
	}
	public void setResType(String resType) 
	{
		this.resType = resType;
	}

	public String getResType() 
	{
		return resType;
	}
	public void setResCity(String resCity) 
	{
		this.resCity = resCity;
	}

	public String getResCity() 
	{
		return resCity;
	}
	public void setResCounty(String resCounty) 
	{
		this.resCounty = resCounty;
	}

	public String getResCounty() 
	{
		return resCounty;
	}
	public void setStagId(String stagId) 
	{
		this.stagId = stagId;
	}

	public String getStagId() 
	{
		return stagId;
	}
	public void setResTime(Date resTime) 
	{
		this.resTime = resTime;
	}

	public Date getResTime() 
	{
		return resTime;
	}
	public void setLongitude(Float longitude) 
	{
		this.longitude = longitude;
	}

	public Float getLongitude() 
	{
		return longitude;
	}
	public void setLatitude(Float latitude) 
	{
		this.latitude = latitude;
	}

	public Float getLatitude() 
	{
		return latitude;
	}
	public void setEnable(Integer enable) 
	{
		this.enable = enable;
	}

	public Integer getEnable() 
	{
		return enable;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("resId", getResId())
            .append("resName", getResName())
            .append("resType", getResType())
            .append("resCity", getResCity())
            .append("resCounty", getResCounty())
            .append("stagId", getStagId())
            .append("resTime", getResTime())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("enable", getEnable())
            .toString();
    }
}
