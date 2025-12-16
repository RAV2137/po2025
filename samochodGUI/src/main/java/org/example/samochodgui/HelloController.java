package org.example.samochodgui;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.samochod.*;

import java.io.IOException;
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
    public ComboBox<Samochod> carSelect;
    public Pane mapa;

    //endregion
    private Samochod car;

    @FXML
    public void onstartButton() {
        if(car==null){pokazBlad("Wybierz auto"); return;};
        car.wlacz();
        refresh();
        System.out.println("Wlaczono silnik");
    }

    public void onstopButton(){
        if(car==null){pokazBlad("Wybierz auto"); return;};
        car.wylacz();
        refresh();
        System.out.println("Wylaczono silnik");
    }

    public void onzwiekszbiegButton() {
        if(car==null){pokazBlad("Wybierz auto"); return;};
        car.zwiekszBieg();
        refresh();
        System.out.println("zwiekszono bieg");
    }

    public void onzmniejszbiegButton() {
        if(car==null){pokazBlad("Wybierz auto"); return;};
        car.zmniejszBieg();
        refresh();
        System.out.println("zmniejszono bieg");
    }

    public void ondodajgazuButton() {
        if(car==null){pokazBlad("Wybierz auto"); return;};
        car.zwiekszObroty();
        refresh();
        System.out.println("dodajgazu");
    }

    public void onujmijgazuButton() {
        if(car==null){pokazBlad("Wybierz auto"); return;};
        car.zmniejszObroty();
        refresh();
        System.out.println("ujmijgazu");

    }

    public void onnacisnijButton() {
        if(car==null){pokazBlad("Wybierz auto"); return;};
        car.wcisnijSprzeglo();
        refresh();
        System.out.println("nacisnieto sprzeglo");
    }

    public void onzwolnijButton() {
        if(car==null){pokazBlad("Wybierz auto"); return;};
        car.zwolnijSprzeglo();
        refresh();
        System.out.println("zwolniono sprzeglo");
    }

    public void ondodajButton() throws IOException
    {
        openAddCarWindow();
        System.out.println("dodano auto");

    }

    public void onusunButton() {
        if(car==null){pokazBlad("Wybierz auto"); return;};
        carSelect.getItems().remove(car);
        car = null;
        carSelect.getSelectionModel().selectFirst();
        System.out.println("usunieto auto");
        refresh();
    }

    public void carSelect(ActionEvent actionEvent) {
        car = carSelect.getSelectionModel().getSelectedItem();
        refresh();
    }

    void refresh() {
        if(car==null){System.out.println("XD problem"); return;};
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

//        carImageView.setTranslateX(car.pozycja.x);
//        carImageView.setTranslateY(car.pozycja.y);

        Platform.runLater(() -> {
            carImageView.setTranslateX(car.pozycja.x);
            carImageView.setTranslateY(car.pozycja.y);
        });

    }

    public void openAddCarWindow() throws IOException {
        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("dodaj_samochod.fxml"));

        Parent root = loader.load();
        // pobranie instancji drugiego kontrolera
        DodajSamochodController addCarController = loader.getController();      //NIE ZADAJEMY PYTAŃ
        // przekazanie referencji do tego kontrolera
        addCarController.setMainController(this);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void addCarToList(Samochod new_car){
        carSelect.getItems().add(new_car);}
    public void pokazBlad(String wiadomosc) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText(wiadomosc);
            alert.showAndWait();
        });
    }

    @FXML
    private ImageView carImageView;
    public void initialize() {
        System.out.println("HelloController initialized");
        // Load and set the car image
        Image carImage = new Image(getClass().getResource("/org/example/samochodgui/pixel-art-orange-auto.png").toExternalForm());
        System.out.println("Image width: " +
                carImage.getWidth() + ", height: " + carImage.getHeight());
        carImageView.setImage(carImage);
        carImageView.setFitWidth(60); // Set appropriate
        carImageView.setFitHeight(60);
        carImageView.setTranslateX(0);
        carImageView.setTranslateY(0);

        mapa.setOnMouseClicked(event -> {
            if(car==null){System.out.println("Wybierz auto"); return;};
            double x = event.getX();
            double y = event.getY();
            Pozycja nowaPozycja = new Pozycja(x, y);
            car.jedzDo(nowaPozycja);
        });


    }
}