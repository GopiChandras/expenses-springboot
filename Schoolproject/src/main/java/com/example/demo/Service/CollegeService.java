package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.College;

public interface CollegeService {
	
	

	College addCollege(College data);

	List<College> getCollege();
	
	College getCollegeById(Long id);

}
