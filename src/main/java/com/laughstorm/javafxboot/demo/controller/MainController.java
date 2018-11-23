package com.laughstorm.javafxboot.demo.controller;

import com.laughstorm.javafxboot.demo.service.AwesomeActionService;
import org.springframework.beans.factory.annotation.Autowired;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

@FXMLController
public class MainController {

    @FXML
    private Label helloLabel;
  
    @FXML
    private TextField nameField;
    
    // Be aware: This is a Spring bean. So we can do the following:
    @Autowired
    private AwesomeActionService actionService;
    
    @FXML
    private void setHelloText(final Event event) {
       final String textToBeShown = actionService.processName(nameField.getText());
       helloLabel.setText(textToBeShown); 
    }
}
