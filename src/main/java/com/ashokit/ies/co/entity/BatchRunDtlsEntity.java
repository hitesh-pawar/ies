package com.ashokit.ies.co.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDtlsEntity {

	@Id
	@GeneratedValue
	@Column(name = "BATCH_RUN_SEQ")
	private Integer batchRunSeq;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;
	@Column(name = "END_DATE")
	private String endDate;
	@Column(name = "INSTANCE_NUM")
	private Integer instanceNum;
	@Column(name = "START_DATE")
	private String startDate;

	public Integer getBatchRunSeq() {
		return batchRunSeq;
	}

	public void setBatchRunSeq(Integer batchRunSeq) {
		this.batchRunSeq = batchRunSeq;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchRunStatus() {
		return batchRunStatus;
	}

	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getInstanceNum() {
		return instanceNum;
	}

	public void setInstanceNum(Integer instanceNum) {
		this.instanceNum = instanceNum;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "BatchRunDtlsEntity [batchRunSeq=" + batchRunSeq + ", batchName=" + batchName + ", batchRunStatus="
				+ batchRunStatus + ", endDate=" + endDate + ", instanceNum=" + instanceNum + ", startDate=" + startDate
				+ "]";
	}

}
