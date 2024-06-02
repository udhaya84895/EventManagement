package com.example.codingassessment.repository;

import com.example.codingassessment.models.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface EventRepository extends JpaRepository<Events, Long>{

    @Override
    Events save(Events event);
}
