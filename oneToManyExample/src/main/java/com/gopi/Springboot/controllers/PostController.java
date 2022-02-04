package com.gopi.Springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.Springboot.entity.Post;
import com.gopi.Springboot.repository.PostRepository;

@RestController
public class PostController {
	
	@Autowired
	public PostRepository postRepository;
	
	
	@PostMapping("/add")
	public Post savePost(@RequestBody Post newPost) {
		
		newPost = this.postRepository.save(newPost);
		return newPost;
	}
	
	@GetMapping("/get")
	public List<Post> getAllPost() {
		List<Post> postList = new ArrayList<>();
		postList = this.postRepository.findAll();
		return postList;
	}
}
