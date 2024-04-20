module BancoApp {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens bancoApp to javafx.fxml;
    exports bancoApp;
    exports bancoApp.controladores;
    exports bancoApp.controladores.admin;
    exports bancoApp.controladores.cliente;
    exports bancoApp.modelos;
    exports bancoApp.vistas;
}