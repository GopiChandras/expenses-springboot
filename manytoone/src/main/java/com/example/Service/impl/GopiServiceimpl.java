package com.example.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Gopi;
import com.example.Repository.GopiRepository;
import com.example.Service.GopiService;

@Service
public class GopiServiceimpl implements GopiService {
	@Autowired
	public GopiRepository gopiRepository;

	@Override
	public Gopi addGopi(Gopi data) {
		
		return gopiRepository.save(data);
	}

}
