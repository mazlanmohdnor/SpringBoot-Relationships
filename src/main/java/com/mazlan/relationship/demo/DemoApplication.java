package com.mazlan.relationship.demo;

import com.mazlan.relationship.demo.entities.Address;
import com.mazlan.relationship.demo.entities.User;
import com.mazlan.relationship.demo.repositories.AddressRepository;
import com.mazlan.relationship.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
        saveData();
    }

    @Transactional
    public void saveData() {
        User user = new User("mazlan");

        Address address = new Address("serdang","selangor","malaysia");
        Address address2 = new Address("serdang2","selangor2","malaysia2");
        Address address3 = new Address("serdang3","selangor3","malaysia3");

        address.setUser(user);
        address2.setUser(user);
        address3.setUser(user);

        user.getAddresses().add(address);
        user.getAddresses().add(address2);
        user.getAddresses().add(address3);

        userRepository.save(user);

    }
}
