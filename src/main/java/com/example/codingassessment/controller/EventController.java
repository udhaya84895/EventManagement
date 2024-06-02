package com.example.codingassessment.controller;


import com.example.codingassessment.dtos.EventRequestDto;
import com.example.codingassessment.dtos.EventResponseDto;
import com.example.codingassessment.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(path = "/events")
public class EventController {

    @Autowired
    private EventService eventService;

    //CRUD

    @PostMapping(path = "/addevent")
    public ResponseEntity<EventResponseDto> addEvent(@RequestBody EventRequestDto eventRequestDto){
        eventService.createEvent(eventRequestDto);
        return ResponseEntity.created(URI.create("/events/getevents/"+eventRequestDto.getId()))
                .cacheControl(CacheControl.maxAge(1, TimeUnit.DAYS)).build();
    }
    @GetMapping(path = "/getevents/{id}")
    public ResponseEntity<EventResponseDto> getEvents(@PathVariable int id){
        EventResponseDto eventResponseDto = eventService.getEvent(id);
        return ResponseEntity.ok().body(eventResponseDto);
    }
    @PutMapping(path = "/updateevent")
    public ResponseEntity<EventResponseDto> updateEvent(int id, @RequestBody EventRequestDto eventRequestDto){
        eventService.updateEvent(id,eventRequestDto);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping(path = "/deleteevent")
    public ResponseEntity<Void> deleteEvent(int id){
        eventService.deleteEvent(id);
        return ResponseEntity.ok().build();
    }

}
