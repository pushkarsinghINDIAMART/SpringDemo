package com.indiamart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee{

    @Id
    private Integer id;
    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    private String designation;

    public Employee(Integer id, String fname, String lname, String designation) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", designation=" + designation +
                '}';
    }
}
