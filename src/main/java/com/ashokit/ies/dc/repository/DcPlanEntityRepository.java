package com.ashokit.ies.dc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.dc.entity.DcPlanEntity;

@Repository
public interface DcPlanEntityRepository extends JpaRepository<DcPlanEntity, Integer> {

}
