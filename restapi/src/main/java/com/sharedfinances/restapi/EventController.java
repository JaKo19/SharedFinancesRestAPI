package com.sharedfinances.restapi;

import com.sharedfinances.restapi.documents.Event;
import com.sharedfinances.restapi.documents.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventRepository repository;

    public EventController(EventRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    List<Event> all() {
        return repository.findAll();
    }

    @PostMapping("/list")
    Event newEvent(@RequestBody Event newEvent) {
        return repository.save(newEvent);
    }

    @GetMapping("/list/{code}")
    Event one(@PathVariable String code) {
        return repository.findByCode(code).get();
    }

    @GetMapping("/list/{code}/all")
    List<Person> allPersons(@PathVariable String code) {
        return repository.findByCode(code).get().getPersons();
    }

    @GetMapping("/list/{code}/{name}")
    Person onePerson(@PathVariable String code, @PathVariable String name) {
        return repository.findByCode(code).get().getPersonByName(name);
    }

    @PutMapping("/list/{code}")
    List<Person> updatePersonList(@PathVariable String code, @RequestBody List<Person> updatePersonList){
        Optional<Event> event = repository.findByCode(code);
        if (event.isPresent()) {
            event.get().setPersons(updatePersonList);
            return updatePersonList;
        }
        return null;
    }
}
