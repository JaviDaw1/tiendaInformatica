package com.example.tiendainformatica;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

public class HelloController {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextField precioField;

    @FXML
    private TextField stockField;

    @FXML
    public void initialize() {
        if (comboBox != null) {
            comboBox.getItems().addAll("Electronica", "Accesorios", "Mobiliario", "Libros");
        }
    }

    public void jButtonActionPerformed() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_ventas", "root", "");

            Map<String, Object> parametros = new HashMap<>();
            parametros.put("categoria", comboBox.getSelectionModel().getSelectedItem());

            JasperPrint print = JasperFillManager.fillReport("src/main/resources/Informes/tiendaInformaticaPorCategoria.jasper", parametros, conexion);
            JasperExportManager.exportReportToPdfFile(print, "src/main/resources/Informes/informe_categoria.pdf");

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void jButtonActionPerformed2() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_ventas", "root", "");

            double precio = Double.parseDouble(precioField.getText());
            int stock = Integer.parseInt(stockField.getText());

            Map<String, Object> parametros = new HashMap<>();
            parametros.put("precio", precio);
            parametros.put("stock", stock);

            JasperPrint print = JasperFillManager.fillReport("src/main/resources/Informes/tiendaInformaticaPorPrecioYStock.jasper", parametros, conexion);
            JasperExportManager.exportReportToPdfFile(print, "src/main/resources/Informes/informe_precio_stock.pdf");

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
