package com.ashokit.ies.ed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.ed.entity.CoTriggersEntity;

@Repository
public interface CoTriggersRepository extends JpaRepository<CoTriggersEntity, Integer> {

	CoTriggersEntity findByCaseId(Integer caseId);

}
