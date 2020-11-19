package com.sharedfinances.restapi;

import com.sharedfinances.restapi.documents.Event;
import com.sharedfinances.restapi.documents.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends MongoRepository<Event, String> {
    Optional<Event> findByCode(@Param("code") String code);
}
