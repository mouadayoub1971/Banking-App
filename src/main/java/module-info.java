module com.example.banking_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires mysql.connector.j;

    opens com.example.banking_app to javafx.fxml;
    exports com.example.banking_app;
    exports com.example.banking_app.Controllers;
    exports com.example.banking_app.Controllers.Admin;
    exports com.example.banking_app.Controllers.Client;
    exports com.example.banking_app.Models;
    exports com.example.banking_app.Views;


}