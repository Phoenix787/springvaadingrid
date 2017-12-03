package com.example.springvaadingrid.service;


import com.example.springvaadingrid.model.Person;
import com.example.springvaadingrid.repository.PersonRepository;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonService {

    @Autowired
    PersonRepository repository;


    @PostConstruct
    private  void init(){
        repository.save(new Person("Mark", "Johnson"));
        repository.save(new Person("Mary Jane", "mary@boom.com"));
        repository.save(new Person("Mark Rom", "mark@rom.com"));
    }

    public List<Person> getAll(){
        return new ArrayList<>(repository.findAll());
    }
}
