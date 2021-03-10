package com.example.apilecture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Email
    @NotNull
    private String email;

    @Size(min=3,max=10)
    @NotNull
    private String username;



    public Long getId() {

        return id;
    }


    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public User(@Email @NotNull String email, @Size(min = 3, max = 10) @NotNull String username) {
        this.email = email;
        this.username = username;
    }

    public User() {
    }
}
