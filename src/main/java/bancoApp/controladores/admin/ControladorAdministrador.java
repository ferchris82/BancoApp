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
            //Agregar estructura switch
        });
    }
}
