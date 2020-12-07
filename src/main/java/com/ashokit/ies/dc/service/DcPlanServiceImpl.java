package com.ashokit.ies.dc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.dc.domain.CaseDomain;
import com.ashokit.ies.dc.domain.DcIncomeDomain;
import com.ashokit.ies.dc.domain.DcPlanDomain;
import com.ashokit.ies.dc.entity.DcPlanEntity;
import com.ashokit.ies.dc.repository.DcPlanEntityRepository;

@Service
public class DcPlanServiceImpl implements DcPlanService {

	@Autowired
	private DcPlanEntityRepository dcPlanEntityRepository;

	@Override
	public DcPlanDomain saveDcPlan(CaseDomain caseDomain) {
		DcPlanEntity dcPlanEntity = new DcPlanEntity();
		dcPlanEntity.setCaseId(caseDomain.getCaseId());
		dcPlanEntity.setFirstName(caseDomain.getFirstName());
		dcPlanEntity.setLastName(caseDomain.getLastName());
		dcPlanEntity.setPlanName(caseDomain.getPlanName());
		DcPlanEntity saveDcPlanEntity = dcPlanEntityRepository.save(dcPlanEntity);
		DcPlanDomain dcPlanDomain = new DcPlanDomain();
		BeanUtils.copyProperties(saveDcPlanEntity, dcPlanDomain);
		return dcPlanDomain;
	}

	@Override
	public DcIncomeDomain setPlanDataToIncome(DcPlanDomain dcPlanDomain) {
		DcIncomeDomain dcIncomeDomain = new DcIncomeDomain();
		dcIncomeDomain.setCaseId(Integer.parseInt(dcPlanDomain.getCaseId()));
		dcIncomeDomain.setName(dcPlanDomain.getFirstName() + " " + dcPlanDomain.getLastName());
		return dcIncomeDomain;
	}

}
