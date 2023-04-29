package hu.unideb.inf;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


import javafx.scene.control.Button;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {





    @FXML
    private Button button;

    @FXML
    private TextField id;

    @FXML
    private Label label;

    @FXML
    private PasswordField pass;

    @FXML
    private Button sign;
    @FXML
    void LogoutButtonAction(ActionEvent event) {

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("You're logged in !!!");
    }
    @FXML
    void sgnButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }
}

