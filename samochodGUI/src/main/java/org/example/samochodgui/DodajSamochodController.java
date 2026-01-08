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
    //region Initialization of Buttons and TextFields
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
    //endregion

    //    Wybrane komponenty
    private Silnik silnik;
    private Sprzeglo sprzeglo;
    private SkrzyniaBiegow skrzynia;

    @FXML
    public void ondodajButton(ActionEvent actionEvent) {
        if(skrzynia==null){mainController.pokazBlad("Wybierz skrzynie"); return;};
        if(silnik==null){mainController.pokazBlad("Wybierz silnik"); return;};
        if(sprzeglo==null){mainController.pokazBlad("Wybierz sprzeglo"); return;};
        if(karoseriamodelText.getText().isEmpty()){mainController.pokazBlad("Wpisz model");return;}
        if(karoserianr_rejestrText.getText().isEmpty()){mainController.pokazBlad("Wpisz numer rejestracyjny");return;}

        String karoseriamodel = karoseriamodelText.getText();
        String karoserianr_rejestr = karoserianr_rejestrText.getText();
        Samochod car= new Samochod(karoseriamodel,karoserianr_rejestr, silnik, sprzeglo, skrzynia);
        mainController.addCarToList(car);
        mainController.carSelect.getSelectionModel().selectLast();

//        mainController.silnik = silnik;
//        mainController.sprzeglo = sprzeglo;     //Przekazanie stworzonych elementów do głównego Controllera
//        mainController.skrzynia = skrzynia;
        Stage stage = (Stage)dodajButton.getScene().getWindow();
        stage.close();
    }
    public void onanulujButton(ActionEvent actionEvent) {
        Stage stage = (Stage) anulujButton.getScene().getWindow();
        stage.close();
    }
    public void ondodajSkrzynieButton(ActionEvent actionEvent) {
        try {
            SkrzyniaBiegow skrzynia = new SkrzyniaBiegow(
                    skrzyniaNazwaText.getText(),
                    Double.parseDouble(skrzyniaCenaText.getText()),
                    Double.parseDouble(skrzyniaWagaText.getText()),
                    Integer.parseInt(skrzyniaMaxBiegText.getText())
            );

            skrzyniaSelect.getItems().add(skrzynia);
            skrzyniaSelect.getSelectionModel().selectLast();

        } catch (NumberFormatException e) {
            mainController.pokazBlad("Cena, waga i liczba biegów muszą być liczbami");
        }
    }
    public void ondodajSilnikButton(ActionEvent actionEvent) {
        try {
            silnik = new Silnik(silnikNazwaText.getText(),
                    parseDouble(silnikCenaText.getText()),
                    parseDouble(silnikWagaText.getText()),
                    parseInt(silnikMaxObrotyText.getText()));
            silnikSelect.getItems().add(silnik);
            silnikSelect.getSelectionModel().selectLast();

        } catch (NumberFormatException e) {
            mainController.pokazBlad("Cena, waga i maksymalne obroty muszą być liczbami");
        }
    }
    public void ondodajSprzegloButton(ActionEvent actionEvent) {
        try{
        sprzeglo = new Sprzeglo(sprzegloNazwaText.getText(),
                parseDouble(sprzegloCenaText.getText()),
                parseDouble(sprzegloWagaText.getText()),
                parseInt(sprzegloStanText.getText()));
        sprzegloSelect.getItems().add(sprzeglo);
        silnikSelect.getSelectionModel().selectLast();
        }
        catch (NumberFormatException e) {
            mainController.pokazBlad("Cena, waga i stan muszą być liczbami");
        }
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
        silnikMaxObrotyText.setText(String.valueOf(silnik.maxObroty));}
    void refresh_sprzeglo(){
        // Sprzęgło
        sprzeglo = sprzegloSelect.getSelectionModel().getSelectedItem();
        sprzegloNazwaText.setText(sprzeglo.getNazwa());
        sprzegloCenaText.setText(String.valueOf(sprzeglo.getCena()));
        sprzegloWagaText.setText(String.valueOf(sprzeglo.getWaga()));
        sprzegloStanText.setText(String.valueOf(sprzeglo.stanSprzegla));
    }

    HelloController mainController;     //zawiera referencje do mainkontrolera
    public void setMainController(HelloController mainController) {     //IDK
        this.mainController = mainController;
//        silnikSelect.getItems().add(mainController.silnik);
    }
    public void initialize() {
        //region PRzykladowe komponenty
        Silnik silnik = new Silnik ("Honda K20A", 20000.0, 150, 8400);
        silnikSelect.getItems().add(silnik);
        silnik = new Silnik ("BMW S54B32", 40000.0, 170, 8000);
        silnikSelect.getItems().add(silnik);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("Getrag 420G", 10000.0,60, 6);
        skrzyniaSelect.getItems().add(skrzynia);
        skrzynia= new SkrzyniaBiegow("Tremec T56", 15000.0 , 65, 6);
        skrzyniaSelect.getItems().add(skrzynia);
        Sprzeglo sprzeglo = new Sprzeglo("Exedy Stage 1", 2000.0, 6, 100);
        sprzegloSelect.getItems().add(sprzeglo);
        sprzeglo = new  Sprzeglo("Clutch Masters FX400", 3000.0, 7, 100);
        sprzegloSelect.getItems().add(sprzeglo);
        //endregion
    }
    }
