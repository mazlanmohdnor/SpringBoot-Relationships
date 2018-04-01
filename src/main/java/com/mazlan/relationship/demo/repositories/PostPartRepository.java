package com.mazlan.relationship.demo.repositories;

import com.mazlan.relationship.demo.entities.PostPart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostPartRepository extends JpaRepository<PostPart, Integer> {
}
