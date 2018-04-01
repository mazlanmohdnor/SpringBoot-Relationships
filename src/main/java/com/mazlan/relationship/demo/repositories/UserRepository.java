package com.mazlan.relationship.demo.repositories;

import com.mazlan.relationship.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
