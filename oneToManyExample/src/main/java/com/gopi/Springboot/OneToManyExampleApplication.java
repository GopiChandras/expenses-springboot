package com.gopi.Springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gopi.Springboot.entity.Comment;
import com.gopi.Springboot.entity.Post;
import com.gopi.Springboot.repository.PostRepository;

@SpringBootApplication
public class OneToManyExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyExampleApplication.class, args);
	}


}
