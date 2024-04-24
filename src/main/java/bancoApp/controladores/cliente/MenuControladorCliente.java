package bancoApp.controladores.cliente;

import bancoApp.vistas.MenuOpcionesCliente;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import bancoApp.modelos.Modelo;

public class MenuControladorCliente implements Initializable {

    public Button dashboard_btn;
    public Button transaction_btn;
    public Button accounts_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListener();
    }

    private void addListener(){
        dashboard_btn.setOnAction( event-> onDashboard());
        transaction_btn.setOnAction(event -> onTransactions());
        accounts_btn.setOnAction(event -> onAccounts());
    }

    private void onDashboard(){
        Modelo.getInstance().getFabricaVista().getClientSelectedMenuItem().set(MenuOpcionesCliente.DASHBOARD);
    }

    private void onTransactions(){
        Modelo.getInstance().getFabricaVista().getClientSelectedMenuItem().set(MenuOpcionesCliente.TRANSACCIONES);
    }

    private void onAccounts(){
        Modelo.getInstance().getFabricaVista().getClientSelectedMenuItem().set(MenuOpcionesCliente.CUENTAS);
    }
}
