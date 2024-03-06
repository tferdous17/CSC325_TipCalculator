package org.example.csc325_tipcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TipCalculatorController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}