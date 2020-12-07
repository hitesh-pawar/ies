package com.ashokit.ies.ar.response;

public class Citizen {

	private String dob;
	private String firstName;
	private String gender;
	private String lastName;
	private String ssn;
	private String stateName;

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "Citizen [dob=" + dob + ", firstName=" + firstName + ", gender=" + gender + ", lastName=" + lastName
				+ ", ssn=" + ssn + ", stateName=" + stateName + "]";
	}

}
