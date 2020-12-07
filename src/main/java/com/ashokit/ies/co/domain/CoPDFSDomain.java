package com.ashokit.ies.co.domain;

import java.sql.Blob;

import javax.persistence.Column;

public class CoPDFSDomain {

	private Integer coPdfId;
	private String planStatus;
	private Integer caseId;
	private Blob pdfDocument;
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
		return "CoPDFSDomain [coPdfId=" + coPdfId + ", planStatus=" + planStatus + ", caseId=" + caseId
				+ ", pdfDocument=" + pdfDocument + ", planName=" + planName + "]";
	}

}
