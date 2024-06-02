package com.example.codingassessment.services;


import com.example.codingassessment.dtos.EventRequestDto;
import com.example.codingassessment.dtos.EventResponseDto;

public interface EventService {
    //CRUD

    void createEvent(EventRequestDto eventRequestDto);
    void updateEvent(int id, EventRequestDto eventRequestDto);
    void deleteEvent(int id);
    EventResponseDto getEvent(int id);
}
