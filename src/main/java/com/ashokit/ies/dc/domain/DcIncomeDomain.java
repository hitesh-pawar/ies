package com.ashokit.ies.dc.domain;

public class DcIncomeDomain {

	private Integer caseId;
	private String name;
	private String workingStatus;
	private String otherIncome;

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkingStatus() {
		return workingStatus;
	}

	public void setWorkingStatus(String workingStatus) {
		this.workingStatus = workingStatus;
	}

	public String getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(String otherIncome) {
		this.otherIncome = otherIncome;
	}

	@Override
	public String toString() {
		return "DcIncomeDomain [caseId=" + caseId + ", name=" + name + ", workingStatus=" + workingStatus
				+ ", otherIncome=" + otherIncome + "]";
	}

}
