package com.nest.online_complaint_portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Complaint {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String phone;
    private String address;
    private String email;
    private String uname;
    private String psw;
    private String cpsw;


    public Complaint() {
    }

    public Complaint(int id, String name, String phone, String address, String email, String uname, String psw, String cpsw) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.uname = uname;
        this.psw = psw;
        this.cpsw = cpsw;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getCpsw() {
        return cpsw;
    }

    public void setCpsw(String cpsw) {
        this.cpsw = cpsw;
    }
}
