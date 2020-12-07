package com.ashokit.ies.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.admin.domain.AccountDomain;
import com.ashokit.ies.admin.domain.PlanDomain;
import com.ashokit.ies.admin.service.PlanService;

@Controller
public class PlanRegistrationController {

	@Autowired
	private PlanService planService;

	@GetMapping("/planReg")
	public String loadPlanRegForm(Model model) {
		PlanDomain planDomain = new PlanDomain();
		model.addAttribute("planReg", planDomain);
		return "planRegistration";
	}

	@PostMapping("/planRegistration")
	public String handleRegistrationBtn(PlanDomain planDomain, RedirectAttributes attributes) {
		boolean isSaved = planService.savePlan(planDomain);
		if (isSaved) {
			attributes.addFlashAttribute("succMsg", "Registration Successfully");

		} else {
			attributes.addFlashAttribute("failMsg", "Registration Fail");

		}
		return "redirect:/planReg";
	}

}
