package com.mazlan.relationship.demo.entities;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subjectId;
    private String subjectName;
    private int subjectMinimum;

    @OneToOne(mappedBy = "subject")
    private Student student;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectMinimum() {
        return subjectMinimum;
    }

    public void setSubjectMinimum(int subjectMinimum) {
        this.subjectMinimum = subjectMinimum;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject() {

    }
}
