package com.aaa.project.system.taskinfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 巡检资源关系表 taskinfo
 * 
 * @author toneySong
 * @date 2019-08-01
 */
public class Taskinfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 序列 */
	private Integer taskNum;
	/** 资源名称 */
	private String resName;
	/** 驻点编号 */
	private Integer stagId;
	/**
	 * 驻点名称
	 */
	private String stagName;
	/** 派发人 */
	private String taskAuthor;
	/** 分配状态 */
	private String taskStatus;

	public void setTaskNum(Integer taskNum) 
	{
		this.taskNum = taskNum;
	}

	public Integer getTaskNum() 
	{
		return taskNum;
	}
	public void setResName(String resName) 
	{
		this.resName = resName;
	}

	public String getResName() 
	{
		return resName;
	}
	public void setStagId(Integer stagId) 
	{
		this.stagId = stagId;
	}

	public Integer getStagId() 
	{
		return stagId;
	}
	public void setTaskAuthor(String taskAuthor) 
	{
		this.taskAuthor = taskAuthor;
	}

	public String getTaskAuthor() 
	{
		return taskAuthor;
	}
	public void setTaskStatus(String taskStatus) 
	{
		this.taskStatus = taskStatus;
	}

	public String getTaskStatus() 
	{
		return taskStatus;
	}

	public String getStagName() {
		return stagName;
	}

	public void setStagName(String stagName) {
		this.stagName = stagName;
	}

	@Override
	public String toString() {
		return "Taskinfo{" +
				"taskNum=" + taskNum +
				", resName='" + resName + '\'' +
				", stagId=" + stagId +
				", stagName='" + stagName + '\'' +
				", taskAuthor='" + taskAuthor + '\'' +
				", taskStatus='" + taskStatus + '\'' +
				'}';
	}
}
