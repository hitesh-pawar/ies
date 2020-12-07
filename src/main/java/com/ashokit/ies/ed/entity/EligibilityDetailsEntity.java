package com.ashokit.ies.ed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityDetailsEntity {

	@Id
	@GeneratedValue
	@Column(name = "ed_trace_id")
	private Integer edTraceID;
	@Column(name = "benefit_amt")
	private String benifitAmt;
	@Column(name = "case_num")
	private String caseId;
	@Column(name = "create_dt")
	private String createDate;
	@Column(name = "denial_reason")
	private String denialReason;
	@Column(name = "plan_name")
	private String planName;
	@Column(name = "plan_start_dt")
	private String planStartDate;
	@Column(name = "plan_end_dt")
	private String planEndDate;
	@Column(name = "plan_status")
	private String planStatus;
	@Column(name = "update_dt")
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
		return "EligibilityDetails [edTraceID=" + edTraceID + ", benifitAmt=" + benifitAmt + ", caseId=" + caseId
				+ ", createDate=" + createDate + ", denialReason=" + denialReason + ", planName=" + planName
				+ ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate + ", planStatus=" + planStatus
				+ ", updateDate=" + updateDate + "]";
	}

}
