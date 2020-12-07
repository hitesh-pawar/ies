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
import com.ashokit.ies.admin.service.AccountService;

@Controller
public class ViewAccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/viewAccount")
	public String handleViewContact(Model model) {
		List<AccountDomain> allAccounts = accountService.getAllAccounts();
		model.addAttribute("accounts", allAccounts);
		return "viewAccounts";
	}

	@GetMapping("/findByRole")
	public String getAllAccountRole(@RequestParam("role") String role, Model model) {
		List<AccountDomain> roles = accountService.getAccountByRole(role);
		System.out.println(roles);
		model.addAttribute("accounts", roles);
		return "viewAccounts";
	}

	@GetMapping("/editAccount")
	public String editUser(@RequestParam("aid") Integer accountId, Model model) {
		AccountDomain accountDomain = accountService.getAccountById(accountId);
		model.addAttribute("accEdit", accountDomain);
		return "accountEdit";
	}

	@PostMapping("/accountEdit")
	public String updateAccount(@ModelAttribute("accEdit") AccountDomain accountDomain, Model model) {
		boolean isUpdate = accountService.updateAccount(accountDomain);
		if (isUpdate) {
			model.addAttribute("succMsg", "Updated Successfully");
		} else {
			model.addAttribute("failMsg", "Updated Fail");
		}
		return "accountEdit";
	}

	@GetMapping("/deleteAccount")
	public String deleteContact(@RequestParam("aid") Integer accountId, RedirectAttributes attributes) {
		AccountDomain accountDomain = accountService.deleteAccount(accountId);
		String accStatus = accountDomain.getAccStatus();
		if (accStatus.equals("Activated")) {
			attributes.addFlashAttribute("delSucc", "Account Activated Successfully");
		} else {
			attributes.addFlashAttribute("delFail", "Account De-Activated Successfully");
		}

		return "redirect:viewAccount";
	}

}
