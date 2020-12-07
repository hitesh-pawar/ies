package com.ashokit.ies.admin.service;

import java.util.List;
import java.util.Map;

import com.ashokit.ies.admin.domain.PlanDomain;

public interface PlanService {

	public boolean savePlan(PlanDomain planDomain);

	public List<PlanDomain> getAllPlans();

	public PlanDomain getPlanById(Integer id);

	public boolean updatePlan(PlanDomain planDomain);

	public PlanDomain deletePlan(Integer id);

	public Map<String, String> loadPlan();

}
