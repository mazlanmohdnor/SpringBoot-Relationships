package com.mazlan.relationship.demo.entities;

import javax.persistence.*;

@Entity
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer wifeId;
    private String wifeName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_husbandId")
    private Husband husband;

    public Wife(String wifeName, Husband husband) {
        this.wifeName = wifeName;
        this.husband = husband;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
