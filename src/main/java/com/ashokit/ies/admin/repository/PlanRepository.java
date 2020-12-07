package com.ashokit.ies.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.admin.entity.AccountEntity;
import com.ashokit.ies.admin.entity.PlanEntity;

@Repository
public interface PlanRepository extends JpaRepository<PlanEntity, Serializable> {

	public PlanEntity findByPlanId(Integer planId);

}
