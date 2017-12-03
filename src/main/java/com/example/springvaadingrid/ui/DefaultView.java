package com.example.springvaadingrid.ui;

import com.example.springvaadingrid.model.Person;
import com.example.springvaadingrid.repository.PersonRepository;
import com.example.springvaadingrid.service.PersonService;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@SpringView
@UIScope
public class DefaultView extends VerticalLayout implements View {

    final
    PersonService service;

//    public DefaultView() {
//        addComponent(new Label("Default view"));
//    }


     @Autowired
    public DefaultView(PersonService service) {
         this.service = service;
         List<Person> persons = service.getAll();

         Grid<Person> grid = new Grid<>(Person.class);
         grid.setItems(persons);
         addComponent(grid);
    }
}
