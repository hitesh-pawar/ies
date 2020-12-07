package com.ashokit.ies.admin.domain;

import java.util.Date;

public class PlanDomain {

	private Integer planId;
	private String planName;
	private String planDesc;
	private String startDate;
	private String endDate;
	private String accStatus;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanDesc() {
		return planDesc;
	}

	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	@Override
	public String toString() {
		return "PlanDomain [planId=" + planId + ", planName=" + planName + ", planDesc=" + planDesc + ", startDate="
				+ startDate + ", endDate=" + endDate + ", accStatus=" + accStatus + "]";
	}

}
