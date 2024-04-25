package bancoApp.controladores.cliente;

import bancoApp.modelos.Transaccion;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TransaccionMovilControlador implements Initializable {
    public FontAwesomeIconView in_icon;
    public FontAwesomeIconView out_icon;
    public Label trans_date_lbl;
    public Label sender_lbl;
    public Label receiver_lbl;
    public Label amount_lbl;

    private final Transaccion transaccion;

    public TransaccionMovilControlador(Transaccion transaccion){
        this.transaccion = transaccion;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
