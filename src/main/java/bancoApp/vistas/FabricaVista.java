package bancoApp.vistas;

import bancoApp.controladores.admin.ControladorAdministrador;
import bancoApp.controladores.cliente.ClienteControlador;
import bancoApp.controladores.cliente.TransaccionesControlador;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FabricaVista {
    // Vista de clientes
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;

    // Vista de administrador
    private AnchorPane createClientView;

    public FabricaVista(){
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    /* 
     * Client Views Section
     */

    public StringProperty getClientSelectedMenuItem(){
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
    /*  */
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
