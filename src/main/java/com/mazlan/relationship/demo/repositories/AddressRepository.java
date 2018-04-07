package com.mazlan.relationship.demo.repositories;

import com.mazlan.relationship.demo.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
