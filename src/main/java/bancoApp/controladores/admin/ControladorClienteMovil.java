package bancoApp.controladores.admin;

import bancoApp.modelos.Cliente;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorClienteMovil implements Initializable {
    public Label fName_lbl;
    public Label lName_lbl;
    public Label pAddress_lbl;
    public Label ch_acc_lbl;
    public Label sv_acc_lbl;
    public Label date_lbl;
    public Button delete_btn;

    private final Cliente cliente;

    public ControladorClienteMovil(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
