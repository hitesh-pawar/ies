package com.ashokit.ies.ar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.ar.domain.ApplicationDomain;
import com.ashokit.ies.ar.service.ApplicationService;

/*
 * This class is use to handle Admin module related functionalities
 * @Auther Admin
 */
@Controller
public class ApplicationRegistrationController {

	// add logger here
	// add properties

	@Autowired
	private ApplicationService applicationService;

	/*
	 * This class is use to diaply application registration form
	 * 
	 * @param model
	 * 
	 * @return String
	 * 
	 */
	@GetMapping("/applicationReg")
	public String loadPlanRegForm(Model model) {
		// Logger.debug("ApplicationRegistrationController::loadPlanRegForm() started")
		// creating empty model object
		ApplicationDomain applicationDomain = new ApplicationDomain();
		// add appReg to model scope
		model.addAttribute("appReg", applicationDomain);
		// Logger.debug("ApplicationRegistrationController::loadPlanRegForm() ended")
		// Logger.info("Application Registration Form Loaded Successfully")
		return "applicationRegistration";
	}

	
	/*
	 * This class is use to register applicant with given values
	 * 
	 * @param model appRegModel // add @modelAttribute in method
	 * @param model
	 * @return String
	 * 
	 */
	@PostMapping("/appRegistration")
	public String handleRegistrationBtn(ApplicationDomain applicationDomain, RedirectAttributes attributes) {

		String app_reg_no = applicationService.saveApplication(applicationDomain);

		if (app_reg_no != null) {
			attributes.addFlashAttribute("succMsg", "Registration Successfully - " + app_reg_no);

		} else {
			attributes.addFlashAttribute("failMsg", "Registration Fail");

		}
		return "redirect:/applicationReg";
	}

}
