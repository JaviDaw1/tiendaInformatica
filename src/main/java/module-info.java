module com.example.tiendainformatica {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires net.sf.jasperreports.core;


    opens com.example.tiendainformatica to javafx.fxml;
    exports com.example.tiendainformatica;
}