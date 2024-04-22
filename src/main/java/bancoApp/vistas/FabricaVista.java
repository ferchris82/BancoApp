package bancoApp.vistas;

import bancoApp.controladores.cliente.ClienteControlador;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FabricaVista {
    // Vista de clientes
    private AnchorPane dashboardView;

    public FabricaVista(){}

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
}
