package com.ashokit.ies.admin.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashokit.ies.admin.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Serializable> {

	public AccountEntity findByEmail(String email);

	@Query(value = "SELECT * FROM ACCOUNT  WHERE ROLE='Case Worker'", nativeQuery = true)
	List<AccountEntity> getAccountByRole();

	@Query(value = "SELECT * FROM ACCOUNT  WHERE ROLE= ?1", nativeQuery = true)
	List<AccountEntity> getAccountByRoleWithParametor(String role);

	public AccountEntity findByAccountId(Integer accountId);

}
