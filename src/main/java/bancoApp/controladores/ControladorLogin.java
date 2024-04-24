package bancoApp.controladores;

import java.net.URL;
import java.util.ResourceBundle;


import bancoApp.modelos.Modelo;
import bancoApp.vistas.TipoDeCuenta;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorLogin implements Initializable {
    public ChoiceBox<TipoDeCuenta> acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fld;
    public TextField password_fld;
    public Button login_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        acc_selector.setItems(FXCollections.observableArrayList(TipoDeCuenta.CLIENTE, TipoDeCuenta.ADMIN));
        acc_selector.setValue(Modelo.getInstance().getFabricaVista().getLoginAccountType());
        acc_selector.valueProperty().addListener(observable -> Modelo.getInstance().getFabricaVista().setLoginAccountType(acc_selector.getValue()));
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin(){
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Modelo.getInstance().getFabricaVista().closeStage(stage);
        if (Modelo.getInstance().getFabricaVista().getLoginAccountType() == TipoDeCuenta.CLIENTE){
            Modelo.getInstance().getFabricaVista().showClientWindow();;
        } else {
            Modelo.getInstance().getFabricaVista().showAdminWindow();
        }
    }
}
