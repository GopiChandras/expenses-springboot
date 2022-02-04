package com.gopi.Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.gopi.Springboot.entity.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
