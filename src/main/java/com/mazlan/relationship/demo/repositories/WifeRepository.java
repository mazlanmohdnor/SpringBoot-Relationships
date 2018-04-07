package com.mazlan.relationship.demo.repositories;

import com.mazlan.relationship.demo.entities.Wife;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WifeRepository extends JpaRepository<Wife, Integer> {
}
