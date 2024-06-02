package com.example.codingassessment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Token extends BaseModel{

    @OneToOne
    private User user;
    private String value;
    private Date expireAt;
    private boolean deleted;
}
