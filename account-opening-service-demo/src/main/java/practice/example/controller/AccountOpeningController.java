package practice.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import practice.example.service.AccountOpeningService;

@RestController
public class AccountOpeningController {

	@Autowired
	private AccountOpeningService service;

	@RequestMapping(method = RequestMethod.GET, value = "/openAccount")	
	public String openAccount(@RequestParam(required=true) String name, @RequestParam(required=true) String accountType, @RequestParam(required=true) String address) {

		String responseBack = service.openAccount(name,accountType,address);
		return responseBack;
	}


}