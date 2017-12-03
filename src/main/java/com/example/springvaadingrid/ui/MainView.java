package com.example.springvaadingrid.ui;

import com.example.springvaadingrid.NavigationManager;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringViewDisplay
@UIScope
public class MainView extends HorizontalLayout implements ViewDisplay {

    private final NavigationManager navigationManager;
    private VerticalLayout content;
    private CssLayout menu;
    private Button defaultViewBtn;

    @Autowired
    public MainView(NavigationManager navigationManager) {
        this.navigationManager = navigationManager;
       //
    }

    @PostConstruct
    private void init(){
        setSizeFull();
        menu = new CssLayout();
        menu.addStyleName(ValoTheme.MENU_ROOT);
        content = new VerticalLayout();
        content.setSizeFull();
        addComponents(menu, content);
        setExpandRatio(content, 1);

        defaultViewBtn = new Button("Go To", event -> navigationManager.navigateToDefaultView());
        defaultViewBtn.addStyleName(ValoTheme.MENU_ITEM);

        menu.addComponent(defaultViewBtn);
//
//        getUI().getNavigator().addView("", DefaultView.class);
//        getUI().getNavigator().navigateTo("");
        //navigationManager.navigateTo(DefaultView.class);
    }

    @Override
    public void showView(View view) {
        content.removeAllComponents();
        content.addComponent(view.getViewComponent());
    }
}
