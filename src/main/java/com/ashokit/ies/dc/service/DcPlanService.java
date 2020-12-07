package com.ashokit.ies.dc.service;

import com.ashokit.ies.dc.domain.CaseDomain;
import com.ashokit.ies.dc.domain.DcIncomeDomain;
import com.ashokit.ies.dc.domain.DcPlanDomain;

public interface DcPlanService {

	public DcPlanDomain saveDcPlan(CaseDomain caseDomain);

	public DcIncomeDomain setPlanDataToIncome(DcPlanDomain dcPlanDomain);

}
