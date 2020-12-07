package com.ashokit.ies.ar.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.ies.admin.domain.AccountDomain;
import com.ashokit.ies.admin.entity.AccountEntity;
import com.ashokit.ies.ar.domain.ApplicationDomain;
import com.ashokit.ies.ar.entity.ApplicationEntity;
import com.ashokit.ies.ar.repository.ApplicationRepository;
import com.ashokit.ies.ar.response.Citizen;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	/*
	 * This class is use for registering applicant here we are using restful service
	 * to validate SSN
	 * 
	 * @param appModel
	 * 
	 * @return String
	 * 
	 */
	@Override
	public String saveApplication(ApplicationDomain applicationDomain) {
		applicationDomain.setAccStatus("Activated");
		RestTemplate restTemplate = new RestTemplate();
		ApplicationEntity entity = new ApplicationEntity();
		try {
			entity = applicationRepository.findBySsn(applicationDomain.getSsn());
			if (entity != null) {
				entity = new ApplicationEntity();
				String endpointUrl = "http://localhost:1234/SSN/verification/" + applicationDomain.getSsn();
				ResponseEntity<Citizen> responseEntity = restTemplate.getForEntity(endpointUrl, Citizen.class);
				int statusCode = responseEntity.getStatusCodeValue();
				Citizen citizen = responseEntity.getBody();
				String stateName = citizen.getStateName();
				if (statusCode == 200) {
					if (stateName.equals("KT")) {
						BeanUtils.copyProperties(applicationDomain, entity);
						ApplicationEntity saveEntity = applicationRepository.save(entity);
						return saveEntity.getApplicationId();
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public List<ApplicationDomain> getAllApplications() {
		List<ApplicationDomain> applicationDomains = new ArrayList<ApplicationDomain>();
		List<ApplicationEntity> list = applicationRepository.findAll();
		list.forEach(entity -> {
			ApplicationDomain applicationDomain = new ApplicationDomain();
			BeanUtils.copyProperties(entity, applicationDomain);
			applicationDomains.add(applicationDomain);
		});
		return applicationDomains;
	}

	@Override
	public ApplicationDomain getApplicationById(String id) {
		Optional<ApplicationEntity> optional = applicationRepository.findById(id);
		if (optional.isPresent()) {
			ApplicationEntity applicationEntity = optional.get();
			ApplicationDomain applicationDomain = new ApplicationDomain();
			BeanUtils.copyProperties(applicationEntity, applicationDomain);
			return applicationDomain;
		}
		return null;
	}

	@Override
	public boolean updateApplication(ApplicationDomain applicationDomain) {
		ApplicationEntity applicationEntity = new ApplicationEntity();
		BeanUtils.copyProperties(applicationDomain, applicationEntity);
		applicationRepository.save(applicationEntity);
		return true;
	}

	@Override
	public ApplicationDomain deleteApplication(String id) {
		ApplicationEntity entity = applicationRepository.findByApplicationId(id);
		String accStatus = entity.getAccStatus();
		if (accStatus.equals("Activated")) {
			entity.setAccStatus("De-Activatde");
		} else {
			entity.setAccStatus("Activated");
		}
		applicationRepository.save(entity);
		ApplicationDomain applicationDomain = new ApplicationDomain();
		BeanUtils.copyProperties(entity, applicationDomain);
		return applicationDomain;
	}

}
