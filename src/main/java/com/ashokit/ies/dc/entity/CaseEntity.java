package com.ashokit.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "DC_CASE")
public class CaseEntity {

	@Id
	@Column(name = "CASE_ID")
	@GenericGenerator(name = "case_id_gen", strategy = "com.ashokit.ies.generators.CaseNoGenerator")
	@GeneratedValue(generator = "case_id_gen")
	private String caseId;
	@Column(name = "APPLICATION_ID")
	private String applicationId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "SSN")
	private String ssn;
	@Column(name = "planName")
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

}
