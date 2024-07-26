package com.EventRegistrationSystem.EventRegistrationSystem.repository;

import com.EventRegistrationSystem.EventRegistrationSystem.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
}