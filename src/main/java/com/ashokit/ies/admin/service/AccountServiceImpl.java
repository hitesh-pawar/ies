package com.ashokit.ies.admin.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.admin.domain.AccountDomain;
import com.ashokit.ies.admin.entity.AccountEntity;
import com.ashokit.ies.admin.repository.AccountRepository;
import com.ashokit.ies.util.EmailUtils;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private EmailUtils emailUtil;

	@Override
	public boolean isUniqueEmail(String email) {
		AccountEntity accountEntity = accountRepository.findByEmail(email);
		return accountEntity != null ? false : true;
	}

	@Override
	public boolean saveAccount(AccountDomain accountDomain) {

		accountDomain.setAccStatus("Activated");

		AccountEntity accountEntity = new AccountEntity();

		BeanUtils.copyProperties(accountDomain, accountEntity);

		AccountEntity savedEntity = accountRepository.save(accountEntity);

		if (savedEntity.getAccountId() != null) {
			String to = accountDomain.getEmail();
			String subject = "Registration Successfully | IES Application";
			String body = getRegSuccMailBody(accountDomain);
			sendRegSuccEmail(to, subject, body);
			return true;
		}
		return false;
	}

	@Override
	public String getRegSuccMailBody(AccountDomain accountDomain) {
		String fileName = "USR-ACC-EMAIL-BODY-TEMPLATE.txt";
		List<String> replacedLines = null;
		String mailBody = null;
		try {
			Path path = Paths.get(fileName, "");
			Stream<String> lines = Files.lines(path);
			replacedLines = lines.map(line -> line.replace("{USR-NAME}", accountDomain.getFirstName())
					.replace("{USR-PWD}", accountDomain.getPazzword())).collect(Collectors.toList());
			mailBody = String.join("", replacedLines);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mailBody;
	}

	@Override
	public boolean sendRegSuccEmail(String to, String subject, String body) {
		return emailUtil.sendEmail(to, subject, body);
	}

	@Override
	public List<AccountDomain> getAllAccounts() {
		List<AccountDomain> accountDomains = new ArrayList<AccountDomain>();
		// List<AccountEntity> byRole = accountRepository.getAccountByRole();
		List<AccountEntity> list = accountRepository.findAll();
		list.forEach(entity -> {
			AccountDomain accountDomain = new AccountDomain();
			BeanUtils.copyProperties(entity, accountDomain);
			accountDomains.add(accountDomain);
		});
		return accountDomains;
	}

	@Override
	public List<AccountDomain> getAccountByRole(String role) {
		List<AccountDomain> accountDomains = new ArrayList<AccountDomain>();
		if (role.equals("1")) {
			List<AccountEntity> byRoleWithParametor = accountRepository.getAccountByRoleWithParametor("Admin");
			byRoleWithParametor.forEach(entity -> {
				AccountDomain accountDomain = new AccountDomain();
				BeanUtils.copyProperties(entity, accountDomain);
				accountDomains.add(accountDomain);
			});
		} else {
			List<AccountEntity> byRoleWithParametor = accountRepository.getAccountByRoleWithParametor("Case Worker");
			byRoleWithParametor.forEach(entity -> {
				AccountDomain accountDomain = new AccountDomain();
				BeanUtils.copyProperties(entity, accountDomain);
				accountDomains.add(accountDomain);
			});
		}
		return accountDomains;
	}

	@Override
	public AccountDomain getAccountById(Integer accountId) {
		Optional<AccountEntity> optional = accountRepository.findById(accountId);
		if (optional.isPresent()) {
			AccountEntity accountEntity = optional.get();
			AccountDomain accountDomain = new AccountDomain();
			BeanUtils.copyProperties(accountEntity, accountDomain);
			return accountDomain;
		}
		return null;
	}

	@Override
	public boolean updateAccount(AccountDomain accountDomain) {
		AccountEntity accountEntity = new AccountEntity();
		BeanUtils.copyProperties(accountDomain, accountEntity);
		accountRepository.save(accountEntity);
		return true;
	}

	@Override
	public AccountDomain deleteAccount(Integer id) {
		AccountEntity entity = accountRepository.findByAccountId(id);
		String accStatus = entity.getAccStatus();
		if (accStatus.equals("Activated")) {
			entity.setAccStatus("De-Activatde");
		} else {
			entity.setAccStatus("Activated");
		}
		accountRepository.save(entity);
		AccountDomain accountDomain = new AccountDomain();
		BeanUtils.copyProperties(entity, accountDomain);
		return accountDomain;
	}

}
