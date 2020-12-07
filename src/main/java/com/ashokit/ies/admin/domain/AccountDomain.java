package com.ashokit.ies.admin.domain;

import java.util.Date;

import javax.persistence.Column;

public class AccountDomain {

	private Integer accountId;
	private String firstName;
	private String lastName;
	private String email;
	private String pazzword;
	private String dateOfBirth;
	private Character gender;
	private Integer ssn;
	private Integer phoneNumber;
	private String role;
	private String accStatus;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPazzword() {
		return pazzword;
	}

	public void setPazzword(String pazzword) {
		this.pazzword = pazzword;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	@Override
	public String toString() {
		return "AccountDomain [accountId=" + accountId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", pazzword=" + pazzword + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", ssn=" + ssn + ", phoneNumber=" + phoneNumber + ", role=" + role + ", accStatus=" + accStatus + "]";
	}

}
