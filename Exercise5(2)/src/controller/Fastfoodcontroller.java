package controller;
import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class Fastfoodcontroller {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    jollibee jollibee = new jollibee();
    mcdonalds mcdonalds = new mcdonalds();
    kfc kfc = new kfc();
    wendeys wendeys = new wendeys();
    popeyes popeyes = new popeyes();
    
    public void initialize() {

        jollibee.setTaste("mas masarap");
        mcdonalds.setTaste("masarap");
        kfc.setTaste("pinaka masarap");
        wendeys.setTaste("di ko alam kasi di pa ako nakakain don");
        popeyes.setTaste("Maalat yung manok");
    
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Mcdonald's is " + mcdonalds.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Jollibee is " + jollibee.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("KFC is " + kfc.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Wendy's is " + wendeys.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Popeyes is " + popeyes.getTaste());
        }

        alert.showAndWait();

    }
}