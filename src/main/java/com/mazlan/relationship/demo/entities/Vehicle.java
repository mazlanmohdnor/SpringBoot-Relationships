package com.mazlan.relationship.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
    @Id
    private String vehicleId;
    private String vehicleType;
    private String vehicleName;

    @OneToOne(mappedBy = "vehicle")
    private User user;

    public Vehicle() {
    }

    public Vehicle(String vehicleId, String vehicleType, String vehicleName) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
