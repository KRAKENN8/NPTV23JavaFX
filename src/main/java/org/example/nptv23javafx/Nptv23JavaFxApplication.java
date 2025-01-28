package org.example.nptv23javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Nptv23JavaFxApplication extends Application {
    private static ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(Nptv23JavaFxApplication.class, args);
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

//        Label label = new Label("Hello World");
//        Button button = new Button("Click me!");
//        button.setOnAction(e -> {
//            label.setText("Hello NPTV23!");
//        })
//        VBox vbox = new VBox();
//        vbox.getChildren().add(label);
//        vbox.getChildren().add(button);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/nptv23JavaFx.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Nptv23JavaFX");
        stage.centerOnScreen();
        stage.show();
    }
}