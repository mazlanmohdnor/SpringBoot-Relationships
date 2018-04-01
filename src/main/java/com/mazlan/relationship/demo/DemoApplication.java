package com.mazlan.relationship.demo;

import com.mazlan.relationship.demo.entities.*;
import com.mazlan.relationship.demo.repositories.*;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    PostRepository postRepository;

    @Autowired
    PostPartRepository postPartRepository;

    @Autowired
    WifeRepository wifeRepository;

    @Autowired
    HusbandRepository husbandRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
        saveData();
    }

    @Transactional
    public void saveData() {
        // Store a wife to DB
//        Wife lisa = new Wife("Lisa", new Husband("David"));
//        wifeRepository.save(lisa);
//
//        Post post = new Post("post 1", new Date(), new PostPart("Body"));
//        postRepository.save(post);

//        Vehicle vehicle = new Vehicle("123","car","proton");
//        Phone phone = new Phone("lg");
//
//        User user = new User("mazlan", vehicle, phone);
//
//        userRepository.save(user);
//
//        Subject subject = new Subject();
//        subject.setSubjectName("calculus");
//        subject.setSubjectMinimum(70);
//
//        Student student = new Student();
//        student.setStudentName("mazlan");
//        student.setStudentCourse("Engineering");
//        student.setSubject(subject);
//
//        studentRepository.save(student);


    }
}
