package org.example.samochodgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import main.samochod.*;

import java.util.ArrayList;

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
    public ComboBox carSelect;
    //endregion
    Samochod car;

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
//        modelSaText.setText("model");
    }
    public void ondodajButton() {
        System.out.println("dodano auto");
        //region Tworzenie obiektu klasy Samochod
        car = new Samochod(modelSaText.getText(),
                nrRejestSaText.getText(),
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
//        auto.add(car);      //dodawanie do listy obiektów
        carSelect.getItems().add(car);    //dodawanie do ComboBox
        refresh();
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

    void refresh(){
        modelSaText.setText(car.modelSa);
        nrRejestSaText.setText(car.nrRejestSa);
        wagaSaText.setText(String.valueOf(car.wagaSa));
        predkoscSaText.setText(String.valueOf(car.predkoscSa));

        nazwaSkText.setText(car.skrzynia.getNazwa());
        cenaSkText.setText(String.valueOf(car.skrzynia.getCena()));
        wagaSkText.setText(String.valueOf(car.skrzynia.getWaga()));
        biegSkText.setText(String.valueOf(car.skrzynia.aktualnyBieg));

        nazwaSiText.setText(car.silnik.getNazwa());
        cenaSiText.setText(String.valueOf(car.silnik.getCena()));
        wagaSiText.setText(String.valueOf(car.silnik.getWaga()));
        obrotySiText.setText(String.valueOf(car.silnik.Obroty));

        nazwaSpText.setText(car.skrzynia.sprzeglo.getNazwa());
        cenaSpText.setText(String.valueOf(car.skrzynia.sprzeglo.getCena()));
        wagaSpText.setText(String.valueOf(car.skrzynia.sprzeglo.getWaga()));
        stanSpText.setText(String.valueOf(car.skrzynia.sprzeglo.stanSprzegla));

    }

//    @FXML
//    private Label welcomeText;
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");}
}
