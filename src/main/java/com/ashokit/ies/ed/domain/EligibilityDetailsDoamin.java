package com.ashokit.ies.ed.domain;

public class EligibilityDetailsDoamin {

	private Integer edTraceID;
	private String benifitAmt;
	private String caseId;
	private String createDate;
	private String denialReason;
	private String planName;
	private String planStartDate;
	private String planEndDate;
	private String planStatus;
	private String updateDate;

	public Integer getEdTraceID() {
		return edTraceID;
	}

	public void setEdTraceID(Integer edTraceID) {
		this.edTraceID = edTraceID;
	}

	public String getBenifitAmt() {
		return benifitAmt;
	}

	public void setBenifitAmt(String benifitAmt) {
		this.benifitAmt = benifitAmt;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getDenialReason() {
		return denialReason;
	}

	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}

	public String getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "EligibilityDetailsDoamin [edTraceID=" + edTraceID + ", benifitAmt=" + benifitAmt + ", caseId=" + caseId
				+ ", createDate=" + createDate + ", denialReason=" + denialReason + ", planName=" + planName
				+ ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate + ", planStatus=" + planStatus
				+ ", updateDate=" + updateDate + "]";
	}

}
