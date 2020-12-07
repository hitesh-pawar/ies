package com.ashokit.ies.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.dc.domain.CaseDomain;
import com.ashokit.ies.dc.domain.DcIncomeDomain;
import com.ashokit.ies.dc.domain.DcPlanDomain;
import com.ashokit.ies.dc.service.DcPlanService;

@Controller
public class PlanSelectionController {

	@Autowired
	private DcPlanService dcplanService;

	@PostMapping("/selectionPlanAction")
	public String saveDcPlan(@ModelAttribute("casePlan") CaseDomain caseDomain, RedirectAttributes attributes) {
		String pageName = null;
		DcPlanDomain saveDcPlan = dcplanService.saveDcPlan(caseDomain);
		DcIncomeDomain planDataToIncome = dcplanService.setPlanDataToIncome(saveDcPlan);
		if (saveDcPlan.getPlanName().equals("SNAP")) {
			attributes.addFlashAttribute("dcIncome", planDataToIncome);
			pageName = "loadSnapIncomeForm";
		}
		return "redirect:/" + pageName;
	}

}
