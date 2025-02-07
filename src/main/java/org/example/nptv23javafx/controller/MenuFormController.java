package org.example.nptv23javafx.controller;

import org.example.nptv23javafx.Nptv23JavaFxApplication;
import org.example.nptv23javafx.tools.SpringFXMLLoader;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MenuFormController {
    private SpringFXMLLoader springFXMLLoader;

    public MenuFormController(SpringFXMLLoader springFXMLLoader) {
        this.springFXMLLoader = springFXMLLoader;
    }

    @FXML private void showAuthorForm() throws IOException {
        FXMLLoader fxmlLoader = springFXMLLoader.load("/author/AuthorForm.fxml");
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        getPrimaryStage().setScene(scene);
        getPrimaryStage().setTitle("Создание нового пользователя");
    }

    @FXML private void showBookForm() throws IOException {
        FXMLLoader fxmlLoader = springFXMLLoader.load("/book/BookForm.fxml");
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        getPrimaryStage().setScene(scene);
        getPrimaryStage().setTitle("Добавление новой книги");
    }

    @FXML private void goBack() throws IOException {
        FXMLLoader fxmlLoader = springFXMLLoader.load("/main/mainForm.fxml");
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        getPrimaryStage().setScene(scene);
        getPrimaryStage().setTitle("Nptv23JavaFX Библиотека");
    }

    private Stage getPrimaryStage() {
        return Nptv23JavaFxApplication.primaryStage;
    }
}