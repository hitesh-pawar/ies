package com.ashokit.ies.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.admin.domain.PlanDomain;
import com.ashokit.ies.admin.entity.PlanEntity;
import com.ashokit.ies.admin.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanRepository planRepository;

	@Override
	public boolean savePlan(PlanDomain planDomain) {
		planDomain.setAccStatus("Activated");
		PlanEntity planEntity = new PlanEntity();
		BeanUtils.copyProperties(planDomain, planEntity);
		planRepository.save(planEntity);
		return true;
	}

	@Override
	public List<PlanDomain> getAllPlans() {
		List<PlanDomain> planDomains = new ArrayList<PlanDomain>();
		List<PlanEntity> planEntities = planRepository.findAll();
		planEntities.forEach(entity -> {
			PlanDomain planDomain = new PlanDomain();
			BeanUtils.copyProperties(entity, planDomain);
			planDomains.add(planDomain);

		});
		return planDomains;
	}

	@Override
	public PlanDomain getPlanById(Integer id) {
		Optional<PlanEntity> optional = planRepository.findById(id);
		if (optional.isPresent()) {
			PlanEntity planEntity = optional.get();
			PlanDomain planDomain = new PlanDomain();
			BeanUtils.copyProperties(planEntity, planDomain);
			return planDomain;
		}
		return null;
	}

	@Override
	public boolean updatePlan(PlanDomain planDomain) {
		PlanEntity planEntity = new PlanEntity();
		BeanUtils.copyProperties(planDomain, planEntity);
		planRepository.save(planEntity);
		return true;
	}

	@Override
	public PlanDomain deletePlan(Integer id) {
		PlanEntity entity = planRepository.findByPlanId(id);
		String planStatus = entity.getAccStatus();
		if (planStatus.equals("Activated")) {
			entity.setAccStatus("De-Activatde");
		} else {
			entity.setAccStatus("Activated");
		}
		planRepository.save(entity);
		PlanDomain planDomain = new PlanDomain();
		BeanUtils.copyProperties(entity, planDomain);
		return planDomain;
	}

	@Override
	public Map<String, String> loadPlan() {
		Map<String, String> planMap = new HashMap<>();
		List<PlanEntity> entitiesList = planRepository.findAll();
		entitiesList.forEach(entity -> {
			planMap.put(entity.getPlanName(), entity.getPlanName());
		});
		return planMap;
	}

}
