package com.ashokit.ies.dc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ies.dc.domain.DcIncomeDomain;
import com.ashokit.ies.dc.entity.DcIncomeEntity;
import com.ashokit.ies.dc.repository.DcIncomeRepository;

@Service
public class DcIncomeServiceImpl implements DcIncomeService {

	@Autowired
	private DcIncomeRepository dcIncomeRepository;

	@Override
	public DcIncomeDomain saveIncomeDetails(DcIncomeDomain dcIncomeDomain) {
		DcIncomeEntity dcIncomeEntity = new DcIncomeEntity();
		BeanUtils.copyProperties(dcIncomeDomain, dcIncomeEntity);
		dcIncomeRepository.save(dcIncomeEntity);
		return dcIncomeDomain;
	}

}
