package bancoApp.controladores;

import java.net.URL;
import java.util.ResourceBundle;


import bancoApp.modelos.Modelo;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorLogin implements Initializable {
    public ChoiceBox acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fld;
    public TextField password_fld;
    public Button login_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> Modelo.getInstance().getFabricaVista().showClientWindow());
    }

    private void onLogin(){
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Modelo.getInstance().getFabricaVista().closeStage(stage);
        Modelo.getInstance().getFabricaVista().showClientWindow();
    }
}
