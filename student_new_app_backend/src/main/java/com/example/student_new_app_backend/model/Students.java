package com.example.student_new_app_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.lang.model.element.Name;

@Entity
@Table(name ="students")

public class Students {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String addmNo;
    private int rollNo;
    private String collageName;

    public Students() {
    }

    public Students(int id, String name, String addmNo, int rollNo, String collageName) {
        this.id = id;
        this.name = name;
        this.addmNo = addmNo;
        this.rollNo = rollNo;
        this.collageName = collageName;
    }


        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddmNo() {
        return addmNo;
    }

    public void setAddmNo(String addmNo) {
        this.addmNo = addmNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }
}


