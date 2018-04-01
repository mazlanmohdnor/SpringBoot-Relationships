package com.mazlan.relationship.demo.repositories;

import com.mazlan.relationship.demo.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
