package com.ashokit.ies.ed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.ed.entity.EligibilityDetailsEntity;

@Repository
public interface EligibilityDetailsRepository extends JpaRepository<EligibilityDetailsEntity, Integer> {

}
