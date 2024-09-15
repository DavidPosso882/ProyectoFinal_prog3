package com.programacion3.proyectofinal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.stereotype.Component;

@Component
public class MainViewController {

    @FXML
    private Button myButton;

    @FXML
    private void handleButtonClick() {
        System.out.println("Button clicked!");
    }
}

