package com.mazlan.relationship.demo.repositories;

import com.mazlan.relationship.demo.entities.Husband;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HusbandRepository extends JpaRepository<Husband, Integer> {
}
