package com.ashokit.ies.ar.service;

import java.util.List;

import com.ashokit.ies.admin.domain.AccountDomain;
import com.ashokit.ies.ar.domain.ApplicationDomain;

public interface ApplicationService {

	public String saveApplication(ApplicationDomain applicationDomain);

	public List<ApplicationDomain> getAllApplications();

	public ApplicationDomain getApplicationById(String id);

	public boolean updateApplication(ApplicationDomain applicationDomain);

	public ApplicationDomain deleteApplication(String id);

}
