package dev.hakuna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAboutBtn(ActionEvent event) {
        System.out.println("Névjegy...");
        App.setRoot("aboutScene");

    }   

    @FXML
    void onClickSearchBtn(ActionEvent event) {
        System.out.println("Keresés...");
        App.setRoot("nameScene");

    }

}
