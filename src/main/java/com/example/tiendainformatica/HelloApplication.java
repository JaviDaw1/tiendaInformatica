package com.example.tiendainformatica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 350);

        stage.setTitle("Hello!");
        stage.setResizable(false);

        Screen screen = Screen.getPrimary();
        double screenWidth = screen.getVisualBounds().getWidth();
        double screenHeight = screen.getVisualBounds().getHeight();

        stage.setX((screenWidth - 600) / 2);
        stage.setY((screenHeight - 600) / 2);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        HelloController controller = new HelloController();
        controller.initialize();
        controller.jButtonActionPerformed();
        controller.jButtonActionPerformed2();
    }
}