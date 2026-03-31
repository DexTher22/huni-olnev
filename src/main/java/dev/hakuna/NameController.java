package dev.hakuna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NameController {
    @FXML
    private Label countNameLabel;

    @FXML
    private TextField huNameField;

    @FXML
    private TextField itNameField;

    @FXML
    void initialize() {
        Integer size = App.nameDictList.size();
        countNameLabel.setText(size.toString());
    }

    @FXML
    void onClickSearchBtn(ActionEvent event) {
        System.out.println(App.nameDictList.get(0).getHuName());
        String huName = huNameField.getText();
        for(NameDict nameDict : App.nameDictList) {
            if(huName.equalsIgnoreCase(nameDict.getHuName())){
                itNameField.setText(nameDict.getItName());
            }
        }
    }

    @FXML
    void onClickBackBtn(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
