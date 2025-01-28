package org.example.nptv23javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Nptv23JavaFxController {
    @FXML private Label label;
    @FXML private Button button;

    @FXML
    private void buttonClick() {
        label.setText("Hello from Controller");
    }

    @FXML
    private void button2Click() {
        label.setText("Hello from button2");
    }
}
