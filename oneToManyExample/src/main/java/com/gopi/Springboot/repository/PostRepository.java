package com.gopi.Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gopi.Springboot.entity.Post;

@Repository
public interface PostRepository  extends JpaRepository<Post,Long>{

} 
