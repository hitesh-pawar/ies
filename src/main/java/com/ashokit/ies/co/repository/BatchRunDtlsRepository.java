package com.ashokit.ies.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.co.entity.BatchRunDtlsEntity;

@Repository
public interface BatchRunDtlsRepository extends JpaRepository<BatchRunDtlsEntity, Integer> {

}
