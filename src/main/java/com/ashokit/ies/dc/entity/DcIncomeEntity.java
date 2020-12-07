package com.ashokit.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DC_INCOME")
public class DcIncomeEntity {

	@Id
	@Column(name = "CASE_ID")
	private Integer caseId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "WORKING_STATUS")
	private String workingStatus;
	@Column(name = "OTHER_INCOME")
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
		return "DcIncomeEntity [caseId=" + caseId + ", name=" + name + ", workingStatus=" + workingStatus
				+ ", otherIncome=" + otherIncome + "]";
	}

}
