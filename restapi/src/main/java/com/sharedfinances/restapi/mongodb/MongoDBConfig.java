package com.sharedfinances.restapi.mongodb;

import com.sharedfinances.restapi.EventRepository;
import com.sharedfinances.restapi.documents.Debtor;
import com.sharedfinances.restapi.documents.Event;
import com.sharedfinances.restapi.documents.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableMongoRepositories(basePackageClasses = EventRepository.class)
@Configuration
public class MongoDBConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(EventRepository personRepository) {
//        List<Person> persons = new ArrayList<>();
//        List<Debtor> debtors = new ArrayList<>();
//        debtors.add(new Debtor("Jonathan", 20, 20));
//        persons.add(new Person("Jannis", 20, 20, debtors, "j@j.com", "123"));
//        return args -> personRepository.save(new Event("Test Event", "123456", persons));
//    }
}
