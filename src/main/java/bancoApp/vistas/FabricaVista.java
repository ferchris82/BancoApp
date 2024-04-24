package bancoApp.vistas;

import bancoApp.controladores.admin.ControladorAdministrador;
import bancoApp.controladores.cliente.ClienteControlador;
import bancoApp.controladores.cliente.TransaccionesControlador;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FabricaVista {
    private TipoDeCuenta loginAccountType;
    // Vista de clientes
    private final ObjectProperty<MenuOpcionesCliente> clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;

    // Vista de administrador
    private final ObjectProperty<MenuOpcionesAdmin> adminSelectedMenuItem;
    private AnchorPane createClientView;

    public FabricaVista(){
        this.loginAccountType = TipoDeCuenta.CLIENTE;
        this.clientSelectedMenuItem = new SimpleObjectProperty<>();
        this.adminSelectedMenuItem = new SimpleObjectProperty<>();
    }

    public TipoDeCuenta getLoginAccountType(){
        return loginAccountType;
    }
    public void setLoginAccountType(TipoDeCuenta loginAccountType){
        this.loginAccountType = loginAccountType;
    }

    /* 
     * Client Views Section
     */
    public ObjectProperty<MenuOpcionesCliente>getClientSelectedMenuItem(){
        return clientSelectedMenuItem;
    }

    public AnchorPane getDashboardView(){
        if(dashboardView == null){
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/fxml/cliente/Dashboard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
        return dashboardView;
    }

    public AnchorPane getTransactionsView(){
        if (transactionsView == null) {
            try {
                transactionsView = new FXMLLoader(getClass().getResource("/fxml/cliente/Transacciones.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return transactionsView;
    }

    public AnchorPane getAccountsView(){
        if (accountsView == null) {
            try {
                accountsView = new FXMLLoader(getClass().getResource("/fxml/cliente/Cuentas.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return accountsView;
    }

    /* 
     * Vista de administrador
     */
    public ObjectProperty<MenuOpcionesAdmin> getAdminSelectedMenuItem(){
        return adminSelectedMenuItem;
    }

    public AnchorPane getCreateClientView(){
        if (createClientView == null) {
            try {
                createClientView = new FXMLLoader(getClass().getResource("/fxml/admin/CrearCliente.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return createClientView;
    } 

    public void showAdminWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/admin/Admin.fxml"));
        ControladorAdministrador controller = new ControladorAdministrador();
        loader.setController(controller);
        createStage(loader);
    }

    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/cliente/Cliente.fxml"));
        ClienteControlador clienteControlador = new ClienteControlador();
        loader.setController(clienteControlador);
        createStage(loader);
        
    }

    private void createStage(FXMLLoader loader){
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Banco App");
        stage.show();
    }

    public void closeStage(Stage stage){
        stage.close();

    }
}
