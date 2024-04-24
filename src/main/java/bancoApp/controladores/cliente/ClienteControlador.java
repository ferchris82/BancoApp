package bancoApp.controladores.cliente;

import java.net.URL;
import java.util.ResourceBundle;

import bancoApp.modelos.Modelo;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class ClienteControlador implements Initializable{
    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Modelo.getInstance().getFabricaVista().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) ->{
            switch (newVal) {
                case TRANSACCIONES -> client_parent.setCenter(Modelo.getInstance().getFabricaVista().getTransactionsView());
                case CUENTAS -> client_parent.setCenter(Modelo.getInstance().getFabricaVista().getAccountsView());
                default -> client_parent.setCenter(Modelo.getInstance().getFabricaVista().getDashboardView());         
            }
        });
    }
}
