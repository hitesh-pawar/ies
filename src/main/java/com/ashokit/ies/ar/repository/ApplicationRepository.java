package com.ashokit.ies.ar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.admin.entity.AccountEntity;
import com.ashokit.ies.ar.entity.ApplicationEntity;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationEntity, String> {

	public ApplicationEntity findByApplicationId(String applicationId);

	public ApplicationEntity findBySsn(String ssn);
}
