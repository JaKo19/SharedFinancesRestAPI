package com.sharedfinances.restapi.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Event {

    private String code;
    private String name;
    private double totalAmount;
    private List<Person> persons;

    public Event(String name, String code, double totalAmount, List<Person> persons) {
        this.name = name;
        this.code = code;
        this.totalAmount = totalAmount;
        this.persons = persons;
    }

    public Person getPersonByName(String name) {
        return getPersons().stream().filter(person -> person.getName().equals(name)).findFirst().get();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
