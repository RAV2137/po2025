package org.example.samochodgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    public Button stopButton;

    @FXML
    public Button startButton;

    public Button ZwiększbiegButton;
    public Button ZmniejszbiegButton;
    public Button dodaj_gazuButton;
    public Button ujmij_gazuButton;
    public Button nacisnijButton;
    public Button zwolnijButton;
//    @FXML
//    private Label welcomeText;
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");}


    @FXML
    public void onstartButton() {
        System.out.println("Wlaczono silnik");}



}
