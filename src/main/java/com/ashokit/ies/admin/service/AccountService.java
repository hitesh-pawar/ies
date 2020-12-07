package com.ashokit.ies.admin.service;

import java.util.List;

import com.ashokit.ies.admin.domain.AccountDomain;

public interface AccountService {

	public boolean isUniqueEmail(String email);

	public boolean saveAccount(AccountDomain accountDomain);

	public String getRegSuccMailBody(AccountDomain accountDomain);

	public boolean sendRegSuccEmail(String to, String subject, String body);

	public List<AccountDomain> getAllAccounts();

	public AccountDomain getAccountById(Integer id);

	public boolean updateAccount(AccountDomain accountDomain);

	public AccountDomain deleteAccount(Integer id);

	public List<AccountDomain> getAccountByRole(String role);

}
