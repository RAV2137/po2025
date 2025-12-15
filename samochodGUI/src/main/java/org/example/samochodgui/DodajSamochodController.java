package org.example.samochodgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.samochod.Samochod;
import main.samochod.Silnik;
import main.samochod.SkrzyniaBiegow;
import main.samochod.Sprzeglo;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class DodajSamochodController {
    public Button dodajButton;
    public Button anulujButton;
    public ComboBox<SkrzyniaBiegow> skrzyniaSelect;
    public ComboBox<Silnik> silnikSelect;
    public ComboBox<Sprzeglo> sprzegloSelect;

    public TextField skrzyniaNazwaText;
    public TextField skrzyniaCenaText;
    public TextField skrzyniaWagaText;
    public TextField skrzyniaMaxBiegText;
    public TextField silnikNazwaText;
    public TextField silnikCenaText;
    public TextField silnikWagaText;
    public TextField silnikMaxObrotyText;
    public TextField sprzegloNazwaText;
    public TextField sprzegloCenaText;
    public TextField sprzegloWagaText;
    public TextField sprzegloStanText;
    public TextField karoseriamodelText;
    public TextField karoserianr_rejestrText;

    //    Wybrane komponenty
    private Silnik silnik;
    private Sprzeglo sprzeglo;
    private SkrzyniaBiegow skrzynia;
//    String karoseriamodel;
//    String karoserianr_rejestr;
//
    @FXML
    public void ondodajButton(ActionEvent actionEvent) {
        String karoserianr_rejestr = karoserianr_rejestrText.getText();
        String karoseriamodel = karoseriamodelText.getText();
        Samochod car= new Samochod(karoseriamodel,karoserianr_rejestr, silnik, sprzeglo, skrzynia);
        mainController.addCarToList(car);
//        mainController.silnik = silnik;
//        mainController.sprzeglo = sprzeglo;     //Pzekazanie stworzonych elementów do głównego Controllera
//        mainController.skrzynia = skrzynia;
        Stage stage = (Stage)dodajButton.getScene().getWindow();
        stage.close();
    }
    public void onanulujButton(ActionEvent actionEvent) {
        Stage stage = (Stage) anulujButton.getScene().getWindow();
        stage.close();
    }
    public void ondodajSkrzynieButton(ActionEvent actionEvent) {
        skrzynia = new SkrzyniaBiegow(skrzyniaNazwaText.getText(),
                parseDouble(skrzyniaCenaText.getText()),
                parseDouble(skrzyniaWagaText.getText()),
                parseInt(skrzyniaMaxBiegText.getText()));
        skrzyniaSelect.getItems().add(skrzynia);
    }
    public void ondodajSilnikButton(ActionEvent actionEvent) {
        silnik = new Silnik(silnikNazwaText.getText(),
                parseDouble(silnikCenaText.getText()),
                parseDouble(silnikWagaText.getText()),
                parseInt(silnikMaxObrotyText.getText()));
        silnikSelect.getItems().add(silnik);

    }
    public void ondodajSprzegloButton(ActionEvent actionEvent) {
        sprzeglo = new Sprzeglo(sprzegloNazwaText.getText(),
                parseDouble(sprzegloCenaText.getText()),
                parseDouble(sprzegloWagaText.getText()),
                parseInt(sprzegloStanText.getText()));
        sprzegloSelect.getItems().add(sprzeglo);
    }

    public void ondodajkaroserieButton(ActionEvent actionEvent) {
    }


    public void onKaroseriaSelect(ActionEvent actionEvent) {

    }
    public void onSkrzyniaSelect(ActionEvent actionEvent) {
        refresh_skrzynia();
    }
    public void onSilnikSelect(ActionEvent actionEvent) {
        refresh_silnik();
    }
    public void onSprzegloSelect(ActionEvent actionEvent) {
        refresh_sprzeglo();
    }

    void refresh_skrzynia() {
        // Skrzynia
        skrzynia = skrzyniaSelect.getSelectionModel().getSelectedItem();
        skrzyniaNazwaText.setText(skrzynia.getNazwa());
        skrzyniaCenaText.setText(String.valueOf(skrzynia.getCena()));
        skrzyniaWagaText.setText(String.valueOf(skrzynia.getWaga()));
        skrzyniaMaxBiegText.setText(String.valueOf(skrzynia.iloscBiegow));}
    void refresh_silnik(){
        // Silnik
        silnik = silnikSelect.getSelectionModel().getSelectedItem();
        silnikNazwaText.setText(silnik.getNazwa());
        silnikCenaText.setText(String.valueOf(silnik.getCena()));
        silnikWagaText.setText(String.valueOf(silnik.getWaga()));
        silnikMaxObrotyText.setText(String.valueOf(silnik.Obroty));}
    void refresh_sprzeglo(){
        // Sprzęgło
        sprzeglo = sprzegloSelect.getSelectionModel().getSelectedItem();
        sprzegloNazwaText.setText(sprzeglo.getNazwa());
        sprzegloCenaText.setText(String.valueOf(sprzeglo.getCena()));
        sprzegloWagaText.setText(String.valueOf(sprzeglo.getWaga()));
        sprzegloStanText.setText(String.valueOf(sprzeglo.stanSprzegla));
    }

    HelloController mainController;
    public void setMainController(HelloController mainController) {     //IDK
        this.mainController = mainController;
//        silnikSelect.getItems().add(mainController.silnik);
    }
}
