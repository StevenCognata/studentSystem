package com.cognata.studentSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // declaring this class can be stored in a database table (JPA)
public class Student {
    @Id // primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementation for the database
    private int id;
    private String name;
    private String address;

    // constructor
    public Student() {
    }

    // getters and setters for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // getters and setters for NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters and setters for ADDRESS
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
