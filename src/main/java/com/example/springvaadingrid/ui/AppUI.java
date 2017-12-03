package com.example.springvaadingrid.ui;

import com.example.springvaadingrid.NavigationManager;
import com.example.springvaadingrid.model.Person;
import com.example.springvaadingrid.service.PersonService;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.spring.navigator.SpringNavigator;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
@Theme("valo")
public class AppUI extends UI  {

    private final MainView mainView;
    private final NavigationManager navigationManager;

    @Autowired
    public AppUI(MainView mainView, NavigationManager navigationManager) {
        this.mainView = mainView;
        this.navigationManager = navigationManager;
    }

    @Override
    protected void init(VaadinRequest request) {


//        List<Person> persons;
//        persons = service.getAll();
//
//        Grid<Person> grid = new Grid<>(Person.class);
//        grid.setItems(persons);
//        root.addComponent(grid);

        setContent(mainView);
        navigationManager.navigateToDefaultView();
    }


}
