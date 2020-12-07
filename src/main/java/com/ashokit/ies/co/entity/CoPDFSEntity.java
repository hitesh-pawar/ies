package com.ashokit.ies.co.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CO_PDFS")
public class CoPDFSEntity {

	@Id
	@GeneratedValue
	@Column(name = "CO_PDF_ID")
	private Integer coPdfId;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "CASE_ID")
	private Integer caseId;
	@Column(name = "PDF_DOCUMENT")
	private Blob pdfDocument;
	@Column(name = "PLAN_NAME")
	private String planName;

	public Integer getCoPdfId() {
		return coPdfId;
	}

	public void setCoPdfId(Integer coPdfId) {
		this.coPdfId = coPdfId;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Blob getPdfDocument() {
		return pdfDocument;
	}

	public void setPdfDocument(Blob pdfDocument) {
		this.pdfDocument = pdfDocument;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "CoPDFSEntity [coPdfId=" + coPdfId + ", planStatus=" + planStatus + ", caseId=" + caseId
				+ ", pdfDocument=" + pdfDocument + ", planName=" + planName + "]";
	}

}
