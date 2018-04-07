package com.mazlan.relationship.demo.entities;

import javax.persistence.*;

@Entity
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer husbandId;
    private String name;

    @OneToOne(mappedBy = "husband")
    private Wife wife;

    public Husband(String name, Wife wife) {
        this.name = name;
    }

    public Husband(String mazlan) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
