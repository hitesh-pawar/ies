package com.ashokit.ies.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.admin.domain.AccountDomain;
import com.ashokit.ies.admin.service.AccountService;

@Controller
public class RegistrationController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/accReg")
	public String loadRegForm(Model model) {
		AccountDomain accountDomain = new AccountDomain();
		model.addAttribute("accReg", accountDomain);
		return "registration";
	}

	@GetMapping("/uniqueMailCheck")
	public @ResponseBody String isEmailUnique(@RequestParam("email") String email) {
		boolean isUnique = accountService.isUniqueEmail(email);
		return isUnique ? "UNIQUE" : "DUPLICATE";
	}

	@PostMapping("/accountRegistration")
	public String handleRegistrationBtn(AccountDomain accountDomain, RedirectAttributes attributes) {

		boolean isSaved = accountService.saveAccount(accountDomain);

		if (isSaved) {
			attributes.addFlashAttribute("succMsg", "Registration Successfully");

		} else {
			attributes.addFlashAttribute("failMsg", "Registration Fail");

		}
		return "redirect:/accReg";
	}

}
