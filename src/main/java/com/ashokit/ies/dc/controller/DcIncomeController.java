package com.ashokit.ies.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.dc.domain.DcIncomeDomain;
import com.ashokit.ies.dc.service.DcIncomeService;

@Controller
public class DcIncomeController {

	@Autowired
	private DcIncomeService dcIncomeService;

	@RequestMapping("/loadSnapIncomeForm")
	public String loadDcIncomeForm(Model model) {
		return "selectPlan";
	}

	@PostMapping("/createIncomeAction")
	public String handleIncomeSubmitBtn(DcIncomeDomain dcIncomeDomain, Model model) {
		DcIncomeDomain saveIncomeDetails = dcIncomeService.saveIncomeDetails(dcIncomeDomain);
		model.addAttribute("dcIncome", saveIncomeDetails);
		return "edForm";
	}
}
