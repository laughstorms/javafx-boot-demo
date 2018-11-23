package com.laughstorm.javafxboot.demo;

import com.laughstorm.javafxboot.demo.view.MainView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class Application extends AbstractJavaFxApplicationSupport{

    public static void main(String[] args) {
        launch(Application.class, MainView.class, args);
    }
}
