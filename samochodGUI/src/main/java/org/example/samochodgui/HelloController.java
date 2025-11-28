package org.example.samochodgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
//import main.java.samochod.*;
import javafx.scene.control.TextField;
import main.samochod.*;

public class HelloController {

    //region Initialization of Buttons and TextFields
    @FXML
    public Button startButton;
    public Button stopButton;
    public Button zwiekszbiegButton;
    public Button zmniejszbiegButton;
    public Button dodajgazuButton;
    public Button ujmijgazuButton;
    public Button nacisnijButton;
    public Button zwolnijButton;
    public Button dodajButton;
    public Button usunButton;

    public TextField nrRejestSaText;
    public TextField modelSaText;
    public TextField wagaSaText;
    public TextField predkoscSaText;
    public TextField nazwaSkText;
    public TextField cenaSkText;
    public TextField wagaSkText;
    public TextField biegSkText;
    public TextField nazwaSiText;
    public TextField cenaSiText;
    public TextField wagaSiText;
    public TextField obrotySiText;
    public TextField nazwaSpText;
    public TextField cenaSpText;
    public TextField stanSpText;
    public TextField wagaSpText;
    //endregion

//    //region Pobieranie i konwersja wartosci
//    // -------- SAMOCHÓD --------
//    String nrRejestSa = nrRejestSaText.getText();
//    String modelSa = modelSaText.getText();
//    double wagaSa = parseDoubleSafe(wagaSaText.getText());
//    double predkoscSa = parseDoubleSafe(predkoscSaText.getText());
//    // -------- SKRZYNIA --------
//    String nazwaSk = nazwaSkText.getText();
//    double cenaSk = parseDoubleSafe(cenaSkText.getText());
//    double wagaSk = parseDoubleSafe(wagaSkText.getText());
//    double biegSk = parseDoubleSafe(biegSkText.getText());
//    // -------- SILNIK --------
//    String nazwaSi = nazwaSiText.getText();
//    double cenaSi = parseDoubleSafe(cenaSiText.getText());
//    double wagaSi = parseDoubleSafe(wagaSiText.getText());
//    double obrotySi = parseDoubleSafe(obrotySiText.getText());
//    // -------- SPRZEGLO --------
//    String nazwaSp = nazwaSpText.getText();
//    String stanSp = stanSpText.getText();
//    double cenaSp = parseDoubleSafe(cenaSpText.getText());
//    double wagaSp = parseDoubleSafe(wagaSpText.getText());
//    //FUNKCJA DO OBSLUGI
//    private double parseDoubleSafe(String text) {
//        try {
//            return Double.parseDouble(text);
//        } catch (Exception e) {
//            return 0; // albo np. throw new IllegalArgumentException
//        }
//    }
//    //endregion


    @FXML
    public void onstartButton() {
        System.out.println("Wlaczono silnik");}
    public void onstopButton() {
        System.out.println("Wylaczono silnik");}
    public void onzwiekszbiegButton() {
        System.out.println("zwiekszono bieg");}
    public void onzmniejszbiegButton() {
        System.out.println("zmniejszono bieg");}
    public void ondodajgazuButton() {
        System.out.println("dodajgazu bieg");}
    public void onujmijgazuButton() {
        System.out.println("ujmijgazu bieg");}
    public void onnacisnijButton() {
        System.out.println("nacisnieto sprzeglo");}
    public void onzwolnijButton() {
//        System.out.println(modelSaText.getText());
        modelSaText.setText("model");
    }
    public void ondodajButton() {
        System.out.println("dodano auto");
        //region Tworzenie obiektu klasy Samochod
        Samochod auto = new Samochod(nrRejestSaText.getText(),
                modelSaText.getText(),
                parseDoubleSafe(wagaSaText.getText()),
                parseDoubleSafe(predkoscSaText.getText()),
                nazwaSkText.getText(),
                parseDoubleSafe(cenaSkText.getText()),
                parseDoubleSafe(wagaSkText.getText()),
                parseIntSafe(biegSkText.getText()),
                nazwaSiText.getText(),
                parseDoubleSafe(cenaSiText.getText()),
                parseDoubleSafe(wagaSiText.getText()),
                parseIntSafe(obrotySiText.getText()),
                nazwaSpText.getText(),
                parseDoubleSafe(cenaSpText.getText()),
                parseDoubleSafe(wagaSpText.getText()),
                parseIntSafe(stanSpText.getText())
                );
        //endregion
        }
    public void onusunButton() {
        System.out.println("usunieto auto");}
//    FUNKCJA DO OBSLUGI POBIERANIE WARTOŚCI
    private double parseDoubleSafe(String text) {
        try {
            return Double.parseDouble(text);
        } catch (Exception e) {
            return 0; // albo np. throw new IllegalArgumentException
        }
    }
    private Integer parseIntSafe(String text) {
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            return 0;
        }
    }



//    @FXML
//    private Label welcomeText;
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");}
}
