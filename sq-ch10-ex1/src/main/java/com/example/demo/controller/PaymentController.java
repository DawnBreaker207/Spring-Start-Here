package com.example.demo.controller;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.NotEnoughMoneyException;
import com.example.demo.model.ErrorDetails;
import com.example.demo.service.PaymentDetails;
import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {
    private final PaymentService paymentService;
    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    public PaymentController(PaymentService paymentService) {
	this.paymentService = paymentService;
    }

//    @PostMapping("/payment")
//    public ResponseEntity<?> makePayment() {
//	try {
//	    PaymentDetails paymentDetails = paymentService.processPayment();
//
//	    return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
//	} catch (NotEnoughMoneyException e) {
//	    ErrorDetails errorDetails = new ErrorDetails();
//	    errorDetails.setMessage("Not enough money to make the payment");
//	    return ResponseEntity.badRequest().body(errorDetails);
//	}
//    }
//  @PostMapping("/payment")
//  public ResponseEntity<?> makePayment() {
//	    PaymentDetails paymentDetails = paymentService.processPayment();
//	    return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
//	
//  }
    
    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(@RequestBody PaymentDetails paymentDetails) {
	logger.info("Received payment " + paymentDetails.getAmount());

	return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);

    }
}
