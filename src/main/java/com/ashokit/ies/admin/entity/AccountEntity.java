package com.ashokit.ies.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ACCOUNT")
public class AccountEntity {

	@Id
	@GeneratedValue
	@Column(name = "ACCOUNT_ID")
	private Integer accountId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PAZZWORD")
	private String pazzword;
	@Column(name = "DATE_OF_BIRTH")
	private String dateOfBirth;
	@Column(name = "GENDER")
	private Character gender;
	@Column(name = "SSN")
	private Integer ssn;
	@Column(name = "PHONE_NUMBER")
	private Integer phoneNumber;
	@Column(name = "ROLE")
	private String role;
	@Column(name = "ACC_STATUS")
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
		return "AccountEntity [accountId=" + accountId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", pazzword=" + pazzword + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", ssn=" + ssn + ", phoneNumber=" + phoneNumber + ", role=" + role + ", accStatus=" + accStatus + "]";
	}

}
