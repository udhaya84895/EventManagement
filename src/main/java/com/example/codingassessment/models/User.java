package com.example.codingassessment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
@Data
public class User extends BaseModel{

    private String name;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
    private boolean isEmailVerified;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isEmailVerified = false;
        this.roles = new ArrayList<>();
    }
}