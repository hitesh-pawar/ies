package com.ashokit.ies.dc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.ar.domain.ApplicationDomain;
import com.ashokit.ies.dc.domain.CaseDomain;
import com.ashokit.ies.dc.entity.CaseEntity;
import com.ashokit.ies.dc.repository.CaseRepository;

@Service
public class CaseServiceImpl implements CaseService {

	@Autowired
	private CaseRepository caseRepository;

	@Override
	public CaseDomain saveCase(ApplicationDomain applicationDomain) {
		CaseDomain caseDomain = new CaseDomain();
		CaseEntity caseEntity = new CaseEntity();
		caseEntity.setApplicationId(applicationDomain.getApplicationId());
		caseEntity.setFirstName(applicationDomain.getFirstName());
		caseEntity.setLastName(applicationDomain.getLastName());
		caseEntity.setSsn(applicationDomain.getSsn());
		CaseEntity saveCaseEntity = caseRepository.save(caseEntity);
		BeanUtils.copyProperties(saveCaseEntity, caseDomain);
		return caseDomain;
	}

}
