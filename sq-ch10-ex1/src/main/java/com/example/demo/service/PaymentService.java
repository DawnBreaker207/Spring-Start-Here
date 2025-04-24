package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.NotEnoughMoneyException;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
	throw new NotEnoughMoneyException();
    }
}
