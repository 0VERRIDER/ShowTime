/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showtime;

import DBConnection.DBHandler;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

/**
 * @author hp
 */
public class TestController implements Initializable {

    @FXML
    private JFXCheckBox a2;

    @FXML
    private JFXCheckBox a1;

    @FXML
    private JFXCheckBox a3;

    @FXML
    private GridPane seats;


    @FXML
    private JFXTextField text;

    private Connection connection;
    private DBHandler handler;
    private PreparedStatement pst;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //warning.setVisible(false);
        handler = new DBHandler();
        a3.setSelected(true);
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Retrieve data from database
        String q1 = "SELECT * from seats";
        try {
            connection = handler.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        }
        a1.setDisable(true);
    }

    public void loginAction(ActionEvent e) throws ClassNotFoundException, SQLException, IOException {

    }

    @FXML
    public void signupAction(ActionEvent event) throws IOException {
        Parent signinView = FXMLLoader.load(getClass().getResource("FXML/test.fxml"));
        Scene signinScene = new Scene(signinView);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(signinScene);
        window.show();
    }
}
