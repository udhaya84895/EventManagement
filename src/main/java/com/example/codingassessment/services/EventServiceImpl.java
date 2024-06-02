package com.example.codingassessment.services;


import com.example.codingassessment.dtos.EventRequestDto;
import com.example.codingassessment.dtos.EventResponseDto;
import com.example.codingassessment.models.Events;
import com.example.codingassessment.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void createEvent(EventRequestDto eventRequestDto) {
        Events event = new Events();
        event.setName(eventRequestDto.getName());
        event.setDate(eventRequestDto.getDate());
        event.setLocation(eventRequestDto.getLocation());
        event.setDescription(eventRequestDto.getDescription());
        eventRepository.save(event);
    }

    @Override
    public void updateEvent(int id,EventRequestDto eventRequestDto) {
        Events event = new Events();
        event.setName(eventRequestDto.getName());
        event.setDate(eventRequestDto.getDate());
        event.setLocation(eventRequestDto.getLocation());
        event.setDescription(eventRequestDto.getDescription());
        eventRepository.save(event);
    }

    @Override
    public void deleteEvent(int id) {
        eventRepository.deleteById((long) id);
    }

    @Override
    public EventResponseDto getEvent(int id) {
        Events event = eventRepository.findById((long) id).get();
        EventResponseDto eventResponseDto = new EventResponseDto();
        eventResponseDto.setName(event.getName());
        eventResponseDto.setDate(event.getDate());
        eventResponseDto.setLocation(event.getLocation());
        eventResponseDto.setDescription(event.getDescription());
        return eventResponseDto;
    }
}
