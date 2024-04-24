package bancoApp.controladores.admin;

import bancoApp.modelos.Modelo;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorAdministrador  implements Initializable {
    public BorderPane admin_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Modelo.getInstance().getFabricaVista().getAdminSelectedMenuItem().addListener((observableValue, oldVal, newVal) ->{
            switch (newVal){
                case CLIENTES -> admin_parent.setCenter(Modelo.getInstance().getFabricaVista().getClientsView());
                case DEPOSITO -> admin_parent.setCenter(Modelo.getInstance().getFabricaVista().getDepositView());
                default -> admin_parent.setCenter(Modelo.getInstance().getFabricaVista().getCreateClientView());
            }
        });
    }
}
