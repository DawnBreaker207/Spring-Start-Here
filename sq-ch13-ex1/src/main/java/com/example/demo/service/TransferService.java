package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class TransferService {

    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
	this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(long idSender, long idReceiver, BigDecimal amount) {
	Account sender = accountRepository.findAccountById(idSender);
	Account receiver = accountRepository.findAccountById(idReceiver);

	BigDecimal senderNewAmout = sender.getAmount().subtract(amount);
	BigDecimal receiverNewAmount = receiver.getAmount().add(amount);

	accountRepository.changeAmount(idSender, receiverNewAmount);
	accountRepository.changeAmount(idReceiver, receiverNewAmount);
    }

    public List<Account> getAllAccounts() {
	return accountRepository.findAllAccounts();
    }

}
