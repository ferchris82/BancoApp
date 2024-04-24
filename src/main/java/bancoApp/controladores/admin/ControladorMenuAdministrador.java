package bancoApp.controladores.admin;

import bancoApp.modelos.Modelo;
import bancoApp.vistas.MenuOpcionesAdmin;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorMenuAdministrador implements Initializable {
    public Button create_client_btn;
    public Button clients_btn;
    public Button deposit_btn;
    public Button logout_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListener();
    }

    private void addListener(){
        create_client_btn.setOnAction(actionEvent -> onCreateClient());
        clients_btn.setOnAction(actionEvent -> onClients());
        deposit_btn.setOnAction(actionEvent -> onDeposit());
    }

    private void onCreateClient(){
        Modelo.getInstance().getFabricaVista().getAdminSelectedMenuItem().set(MenuOpcionesAdmin.CREAR_CLIENTE);
    }

    private void onClients(){
        Modelo.getInstance().getFabricaVista().getAdminSelectedMenuItem().set(MenuOpcionesAdmin.CLIENTES);
    }

    private void onDeposit(){
        Modelo.getInstance().getFabricaVista().getAdminSelectedMenuItem().set(MenuOpcionesAdmin.DEPOSITO);
    }

}
