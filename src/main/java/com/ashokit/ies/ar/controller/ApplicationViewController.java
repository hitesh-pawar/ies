package com.ashokit.ies.ar.controller;

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
import com.ashokit.ies.ar.domain.ApplicationDomain;
import com.ashokit.ies.ar.service.ApplicationService;

@Controller
public class ApplicationViewController {

	@Autowired
	private ApplicationService applicationService;

	@GetMapping("/viewApplication")
	public String handleViewApplications(Model model) {
		List<ApplicationDomain> allApplications = applicationService.getAllApplications();
		model.addAttribute("applications", allApplications);
		return "viewApplications";
	}

	@GetMapping("/editApplication")
	public String editApplication(@RequestParam("appId") String applicationId, Model model) {
		ApplicationDomain applicationDomain = applicationService.getApplicationById(applicationId);
		model.addAttribute("appEdit", applicationDomain);
		return "applicationEdit";
	}

	@PostMapping("/applicationEdit")
	public String updateApplication(@ModelAttribute("appEdit") ApplicationDomain applicationDomain, Model model) {
		boolean isUpdate = applicationService.updateApplication(applicationDomain);
		if (isUpdate) {
			model.addAttribute("succMsg", "Updated Successfully");
		} else {
			model.addAttribute("failMsg", "Updated Fail");
		}
		return "applicationEdit";
	}

	@GetMapping("/deleteApplication")
	public String deleteContact(@RequestParam("appId") String applicationId, RedirectAttributes attributes) {
		ApplicationDomain applicationDomain = applicationService.deleteApplication(applicationId);
		String accStatus = applicationDomain.getAccStatus();
		if (accStatus.equals("Activated")) {
			attributes.addFlashAttribute("delSucc", "Applicant Activated Successfully");
		} else {
			attributes.addFlashAttribute("delFail", "Applicant De-Activated Successfully");
		}

		return "redirect:viewApplication";
	}

}
