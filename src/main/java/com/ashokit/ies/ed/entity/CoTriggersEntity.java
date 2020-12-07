package com.ashokit.ies.ed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CO_TRIGGERS")
public class CoTriggersEntity {

	@Id
	@GeneratedValue
	@Column(name = "trg_id")
	private Integer trgId;
	@Column(name = "case_num")
	private Integer caseId;
	@Column(name = "create_dt")
	private String createDate;
	@Column(name = "trg_status")
	private String trgStatus;
	@Column(name = "update_dt")
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
		return "CoTriggers [trgId=" + trgId + ", caseId=" + caseId + ", createDate=" + createDate + ", trgStatus="
				+ trgStatus + ", updateDate=" + updateDate + "]";
	}

}
