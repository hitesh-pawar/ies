package com.ashokit.ies.dc.domain;

public class CaseDomain {

	private String caseId;
	private String applicationId;
	private String firstName;
	private String lastName;
	private String ssn;
	private String planName;

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "CaseDomain [caseId=" + caseId + ", applicationId=" + applicationId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", ssn=" + ssn + ", planName=" + planName + "]";
	}

}
