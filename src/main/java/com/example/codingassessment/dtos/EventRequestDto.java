package com.example.codingassessment.dtos;

import lombok.Data;


@Data
public class EventRequestDto {
    int id;
    String name;
    String date;
    String location;
    String description;
}
