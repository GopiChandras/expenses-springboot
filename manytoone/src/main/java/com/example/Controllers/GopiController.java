package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Gopi;
import com.example.Repository.GopiRepository;
import com.example.Service.GopiService;

@RestController
@RequestMapping("/gopi")
public class GopiController {
	@Autowired
	public GopiService gopiService;
    @Autowired
    private GopiRepository gopiRepository;
    
    @PostMapping("/add")
    public Gopi  addGopi(@RequestBody Gopi data) {
    	return this.gopiService.addGopi(data);
    }
}
