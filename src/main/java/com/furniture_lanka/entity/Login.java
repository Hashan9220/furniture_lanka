package com.furniture_lanka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)

 */

@Entity
public class Login {

    @Id
    private String name;
    private String password;

    public Login() {
    }

    public Login(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
