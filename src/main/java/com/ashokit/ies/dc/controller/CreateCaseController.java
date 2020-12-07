package com.ashokit.ies.dc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.ies.admin.service.PlanService;
import com.ashokit.ies.ar.domain.ApplicationDomain;
import com.ashokit.ies.ar.service.ApplicationService;
import com.ashokit.ies.dc.domain.CaseDomain;
import com.ashokit.ies.dc.service.CaseService;

@Controller
public class CreateCaseController {

	@Autowired
	private ApplicationService applicationService;

	@Autowired
	private CaseService caseService;

	@Autowired
	private PlanService planService;

	@GetMapping("/createCaseForm")
	public String loadCaseForm() {
		return "createCase";
	}

	@GetMapping("/searchApplicant")
	public String searchApplicant(@RequestParam("applicationId") String applicationId, Model model) {
		ApplicationDomain applications = applicationService.getApplicationById(applicationId);
		if (applications != null) {
			model.addAttribute("applications", applications);
		} else {
			model.addAttribute("errMsg", "Wrong Application Number");
		}

		return "createCase";
	}

	@GetMapping("/createCase")
	public String createCase(@RequestParam("applicationId") String applicationId, Model model) {
		ApplicationDomain applications = applicationService.getApplicationById(applicationId);
		CaseDomain caseDomain = caseService.saveCase(applications);
		model.addAttribute("casePlan", caseDomain);
		Map<String, String> plans = planService.loadPlan();
		model.addAttribute("plans", plans);
		return "planSelection";
	}

}
