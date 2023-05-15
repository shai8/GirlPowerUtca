package hu.unideb.inf;

import hu.unideb.inf.utils.HibernateUtil;
import hu.unideb.inf.entitypackage.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {
    @FXML
    private Label label;

    @FXML
    private Button loginbutton;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private TextField usernamefield;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginbutton.setOnAction(event -> handleLoginButtonAction());
    }


    private void handleLoginButtonAction() {
        String username = usernamefield.getText();
        String password = passwordfield.getText();

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM User u WHERE u.username = :username AND u.password = :password";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            User user = query.uniqueResult();

            if (user != null) {
                System.out.println("You are logged in");
                // For example, navigate to another page or display a success message
            } else {
                // Login failed, display error message
                showErrorMessage("Invalid username or password.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            showErrorMessage("An error occurred during login.");
        }
    }

    private void showErrorMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Error");
        alert.setHeaderText("Error" );
        alert.setContentText(message);
        alert.showAndWait();
    }
}
