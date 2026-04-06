package dev.hakuna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {

    @FXML
    void onClickOpenLink(ActionEvent event) {
        App.hostServices.showDocument("https://github.com/DexTher22/huni-olnev");
    }

    @FXML
    void onClickBackBtn(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
