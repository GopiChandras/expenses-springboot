package com.example.demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repostery.CollegeRepo;
import com.example.demo.Service.CollegeService;
import com.example.demo.entity.College;

@Service
public class CollegeServiceImpl implements CollegeService  {
	
	@Autowired
	CollegeRepo collegeRepo;

	@Override
	public College addCollege(College data) {
	
		return collegeRepo.save(data);
	}

	@Override
	public List<College> getCollege() {
		
		return collegeRepo.findAll();
	}

	@Override
	public College getCollegeById(Long id) {

		return collegeRepo.getById(id);
	}

	

}
