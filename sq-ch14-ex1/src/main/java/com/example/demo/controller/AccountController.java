package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TransferRequest;
import com.example.demo.model.Account;
import com.example.demo.service.TransferService;

@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService) {
	this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request) {
	transferService.transferMoney(request.getSenderAccountId(), request.getReceiverAccountId(),
		request.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam(required = false) String name) {
	if (name == null) {
	    return transferService.getAllCounts();
	} else {
	    return transferService.findAccountsByName(name);
	}
    }
}
