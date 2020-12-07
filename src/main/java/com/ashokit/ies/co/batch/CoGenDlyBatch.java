package com.ashokit.ies.co.batch;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ashokit.ies.co.domain.BatchRunDtlsDomain;
import com.ashokit.ies.co.entity.BatchRunDtlsEntity;
import com.ashokit.ies.co.repository.BatchRunDtlsRepository;
import com.ashokit.ies.ed.entity.CoTriggersEntity;
import com.ashokit.ies.ed.repository.CoTriggersRepository;

public class CoGenDlyBatch {

	@Autowired
	private BatchRunDtlsRepository batchRepo;

	@Autowired
	private CoTriggersRepository triggersRepo;
	/*
	 * preProcess start postProcess
	 */

	public BatchRunDtlsDomain preProcess() {
		BatchRunDtlsEntity dtlsEntity = new BatchRunDtlsEntity();
		BatchRunDtlsDomain domain = new BatchRunDtlsDomain();
		domain.setStartDate("01-01-2020");
		BeanUtils.copyProperties(domain, dtlsEntity);
		BatchRunDtlsEntity saveEntity = batchRepo.save(dtlsEntity);
		return domain;
	}

	public void start(Integer caseNO) {
		CoTriggersEntity caseData = triggersRepo.findByCaseId(caseNO);
		// process(caseData);
	}

	public BatchRunDtlsDomain postProcess() {
		BatchRunDtlsEntity dtlsEntity = new BatchRunDtlsEntity();
		BatchRunDtlsDomain domain = new BatchRunDtlsDomain();
		domain.setEndDate("01-02-2020");
		BeanUtils.copyProperties(domain, dtlsEntity);
		BatchRunDtlsEntity saveEntity = batchRepo.save(dtlsEntity);
		return domain;
	}

}
