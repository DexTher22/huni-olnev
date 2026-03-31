module dev.hakuna {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens dev.hakuna to javafx.fxml;
    exports dev.hakuna;
}
