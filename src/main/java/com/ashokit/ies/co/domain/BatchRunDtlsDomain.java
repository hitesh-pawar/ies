package com.ashokit.ies.co.domain;

public class BatchRunDtlsDomain {

	private Integer batchRunSeq;
	private String batchName;
	private String batchRunStatus;
	private String endDate;
	private Integer instanceNum;
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
		return "BatchRunDtlsDomain [batchRunSeq=" + batchRunSeq + ", batchName=" + batchName + ", batchRunStatus="
				+ batchRunStatus + ", endDate=" + endDate + ", instanceNum=" + instanceNum + ", startDate=" + startDate
				+ "]";
	}

}
