package com.ashokit.ies.dc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.dc.entity.CaseEntity;

@Repository
public interface CaseRepository extends JpaRepository<CaseEntity, String> {

}
