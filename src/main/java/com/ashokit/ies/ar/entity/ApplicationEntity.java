package com.ashokit.ies.ar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "APPLICATION")
public class ApplicationEntity {

	@Id
	@Column(name = "APPLICATION_ID")
	@GenericGenerator(name = "app_reg_id_gen", strategy = "com.ashokit.ies.generators.AppRegNoGenerator")
	@GeneratedValue(generator = "app_reg_id_gen")
	private String applicationId;

	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "DOB")
	private String dateOfBirth;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "SSN")
	private String ssn;
	@Column(name = "PHONE_NUMBER")
	private Integer phoneNumber;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ACC_STATUS")
	private String accStatus;

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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	@Override
	public String toString() {
		return "ApplicationEntity [applicationId=" + applicationId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", ssn=" + ssn + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", accStatus=" + accStatus + "]";
	}

}
