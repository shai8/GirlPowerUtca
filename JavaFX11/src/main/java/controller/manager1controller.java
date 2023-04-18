package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class manager1controller implements Initializable {

    @FXML
    private Button btn_delete;

    @FXML
    private Button btn_insert;

    @FXML
    private Button btn_update;

    @FXML
    private TableColumn<?, ?> column_author;

    @FXML
    private TableColumn<?, ?> column_id;

    @FXML
    private TableColumn<?, ?> column_isbn;

    @FXML
    private TableColumn<?, ?> column_pages;

    @FXML
    private TableColumn<?, ?> column_title;

    @FXML
    private TableColumn<?, ?> column_year;

    @FXML
    private TableView<?> table_view_books;

    @FXML
    private TextField textfield_Author;

    @FXML
    private TextField textfield_ID;

    @FXML
    private TextField textfield_isbn;

    @FXML
    private TextField textfield_pages;

    @FXML
    private TextField textfield_title;

    @FXML
    private TextField textfield_year;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
