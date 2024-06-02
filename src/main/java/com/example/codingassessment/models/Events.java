package com.example.codingassessment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "Events")
@Getter
@Setter
public class Events extends BaseModel{

    String name;
    String date;
    String location;
    String description;
}
