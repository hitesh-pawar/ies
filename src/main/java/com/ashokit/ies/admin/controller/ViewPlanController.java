package com.ashokit.ies.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.admin.domain.AccountDomain;
import com.ashokit.ies.admin.domain.PlanDomain;
import com.ashokit.ies.admin.service.PlanService;

@Controller
public class ViewPlanController {

	@Autowired
	private PlanService planService;

	@GetMapping("/viewPlan")
	public String handleViewPlan(Model model) {
		List<PlanDomain> allPlans = planService.getAllPlans();
		model.addAttribute("plans", allPlans);
		return "viewPlans";
	}

	@GetMapping("/editPlan")
	public String editUser(@RequestParam("pid") Integer planId, Model model) {
		PlanDomain planDomain = planService.getPlanById(planId);
		model.addAttribute("plEdit", planDomain);
		return "planEdit";
	}

	@PostMapping("/planEdit")
	public String updateAccount(@ModelAttribute("plEdit") PlanDomain planDomain, Model model) {
		boolean isUpdate = planService.updatePlan(planDomain);
		if (isUpdate) {
			model.addAttribute("succMsg", "Updated Successfully");
		} else {
			model.addAttribute("failMsg", "Updated Fail");
		}
		return "planEdit";
	}

	@GetMapping("/deletePlan")
	public String deleteContact(@RequestParam("pid") Integer planId, RedirectAttributes attributes) {
		PlanDomain planDomain = planService.deletePlan(planId);
		String accStatus = planDomain.getAccStatus();
		if (accStatus.equals("Activated")) {
			attributes.addFlashAttribute("delSucc", "Plan Activated Successfully");
		} else {
			attributes.addFlashAttribute("delFail", "Plan De-Activated Successfully");
		}

		return "redirect:viewPlan";
	}

}
