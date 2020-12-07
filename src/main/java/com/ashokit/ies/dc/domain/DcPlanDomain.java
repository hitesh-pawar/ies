package com.ashokit.ies.dc.domain;

public class DcPlanDomain {

	private String caseId;
	private String firstName;
	private String lastName;
	private String planName;

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "DcPlanDomain [caseId=" + caseId + ", firstName=" + firstName + ", lastName=" + lastName + ", planName="
				+ planName + "]";
	}

}
