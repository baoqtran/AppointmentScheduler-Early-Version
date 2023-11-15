package main;
import helper.JDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.util.Objects;

/**
 * Appointment Scheduler
 */
public class Main extends Application {
    /**
     * Redirects to login screen
     *
     * @param stage setting stage
     * @throws Exception addresses unhandled exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/Login.fxml")));
        stage.setTitle("Scheduling Application");
        stage.setScene(new Scene(root));
        stage.show();
        stage.centerOnScreen();
    }


    public static void main(String[] args){
        JDBC.openConnection();
        launch(args);
        JDBC.closeConnection();
    }
}