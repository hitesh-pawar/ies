package com.ashokit.ies.ed.domain;

public class CoTriggersDomain {

	private Integer trgId;
	private Integer caseId;
	private String createDate;
	private String trgStatus;
	private String updateDate;

	public Integer getTrgId() {
		return trgId;
	}

	public void setTrgId(Integer trgId) {
		this.trgId = trgId;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getTrgStatus() {
		return trgStatus;
	}

	public void setTrgStatus(String trgStatus) {
		this.trgStatus = trgStatus;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "CoTriggersDomain [trgId=" + trgId + ", caseId=" + caseId + ", createDate=" + createDate + ", trgStatus="
				+ trgStatus + ", updateDate=" + updateDate + "]";
	}

}
