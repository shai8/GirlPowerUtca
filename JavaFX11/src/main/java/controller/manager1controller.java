package controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.LibrarybookEntity;

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
    private TableColumn<?, ?> column_title;

    @FXML
    private TableColumn<?, ?> column_year;

    @FXML
    private TableView<LibrarybookEntity> table_view_books;

    @FXML
    private TextField textfield_Author;

    @FXML
    private TextField textfield_ID;

    @FXML
    private TextField textfield_isbn;

    @FXML
    private TextField textfield_title;

    @FXML
    private TextField textfield_year;



    @FXML
    void handleButtonAction(ActionEvent event) {

    }


    private ObservableList getBooks ;
    private LibrarybookEntity book;
    final    EntityManagerFactory emf = Persistence.createEntityManagerFactory("girlpowerutca");
    final    EntityManager em = emf.createEntityManager();



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        setupTable();

    }
/*private void updateLibrarybook(){
    Query rq = em.CreateNamedQuery("LibrarybookEntity.findAll");
    List results = rq.getResultList();
    if(book == null)
        book = FXCollections.observableArrayList(results);
    else{
        book.clear();
        book.addAll(results);
    }*/




    private void setupTable() {

        column_id = new TableColumn<LibrarybookEntity, Integer>("ID");
        column_title = new TableColumn<LibrarybookEntity, String>("Title");
        column_author = new TableColumn<LibrarybookEntity, String>("Author");
        column_year = new TableColumn<LibrarybookEntity, Integer>("Year");
        column_isbn = new TableColumn<LibrarybookEntity, Long>("ISBN");

        column_id.setMinWidth(100);
        column_title.setMinWidth(200);
        column_author.setMinWidth(200);
        column_year.setMinWidth(200);
        column_isbn.setMinWidth(200);

        column_id.setText("ID");
        column_title.setText("Title");
        column_author.setText("Author");
        column_year.setText("Year");
        column_isbn.setText("ISBN");


        column_id.setCellValueFactory(new PropertyValueFactory("id"));
        column_title.setCellValueFactory(new PropertyValueFactory<>("title"));
        column_author.setCellValueFactory(new PropertyValueFactory<>("author"));
        column_year.setCellValueFactory(new PropertyValueFactory<>("year"));
        column_isbn.setCellValueFactory(new PropertyValueFactory<>("isbn"));

        table_view_books.setItems(getBooks);
    }

    }
