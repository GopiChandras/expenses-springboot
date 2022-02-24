package com.example.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.PamentEntity;
import com.example.Repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository repository;
	 
	public PamentEntity doPayment(PamentEntity pamentEntity) {
		
		return repository.save(pamentEntity);
	}

}
