package com.example.tiendainformatica;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Screen;

public class MainController {
    public void goToCategoriaPage() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("informes-categoria-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 350); // Tamaño fijo de la ventana
            Stage stage = new Stage();
            stage.setTitle("Informe por Categoría");

            stage.setResizable(false);

            Screen screen = Screen.getPrimary();
            double screenWidth = screen.getVisualBounds().getWidth();
            double screenHeight = screen.getVisualBounds().getHeight();
            stage.setX((screenWidth - 500) / 2);
            stage.setY((screenHeight - 350) / 2);

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goToPrecioStockPage() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("informes-precio-stock-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 350);
            Stage stage = new Stage();
            stage.setTitle("Informe por Precio y Stock");

            stage.setResizable(false);

            Screen screen = Screen.getPrimary();
            double screenWidth = screen.getVisualBounds().getWidth();
            double screenHeight = screen.getVisualBounds().getHeight();
            stage.setX((screenWidth - 500) / 2);
            stage.setY((screenHeight - 350) / 2);

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
