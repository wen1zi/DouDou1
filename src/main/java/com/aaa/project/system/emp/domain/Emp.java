package com.aaa.project.system.emp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 代维公司代维人员表 emp
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
public class Emp extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 员工工号 */
	private Integer empno;
	/** 员工姓名 */
	private String ename;
	/** 员工性别 */
	private String empsex;
	/** 员工年龄 */
	private Integer empage;
	/** 签到次数 */
	private Integer signcount;
	/** 应巡检次数 */
	private Integer empcount;
	/** 员工联系方式 */
	private String phone;
	/** 密码 */
	private String password;
	/** 驻点编号 */
	private String stagId;

	public void setEmpno(Integer empno) 
	{
		this.empno = empno;
	}

	public Integer getEmpno() 
	{
		return empno;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public String getEname() 
	{
		return ename;
	}
	public void setEmpsex(String empsex) 
	{
		this.empsex = empsex;
	}

	public String getEmpsex() 
	{
		return empsex;
	}
	public void setEmpage(Integer empage) 
	{
		this.empage = empage;
	}

	public Integer getEmpage() 
	{
		return empage;
	}
	public void setSigncount(Integer signcount) 
	{
		this.signcount = signcount;
	}

	public Integer getSigncount() 
	{
		return signcount;
	}
	public void setEmpcount(Integer empcount) 
	{
		this.empcount = empcount;
	}

	public Integer getEmpcount() 
	{
		return empcount;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getPassword() 
	{
		return password;
	}
	public void setStagId(String stagId) 
	{
		this.stagId = stagId;
	}

	public String getStagId() 
	{
		return stagId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("empno", getEmpno())
            .append("ename", getEname())
            .append("empsex", getEmpsex())
            .append("empage", getEmpage())
            .append("signcount", getSigncount())
            .append("empcount", getEmpcount())
            .append("phone", getPhone())
            .append("password", getPassword())
            .append("stagId", getStagId())
            .toString();
    }
}
