package dev.hakuna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {

    @FXML
    void onClickBackBtn(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
