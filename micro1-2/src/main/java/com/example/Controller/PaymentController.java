package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.PamentEntity;
import com.example.Service.PaymentService;
@RestController
@RequestMapping("/payment")
public class PaymentController {
   @Autowired
	private PaymentService service;
     @PostMapping("/doPayment")
   public PamentEntity doPamentEntity(@RequestBody PamentEntity pamentEntity) {
	   return service.doPayment(pamentEntity);
   }
}
