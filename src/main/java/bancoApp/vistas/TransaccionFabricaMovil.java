package bancoApp.vistas;

import bancoApp.controladores.cliente.TransaccionMovilControlador;
import bancoApp.modelos.Transaccion;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

public class TransaccionFabricaMovil extends ListCell<Transaccion> {
    @Override
    protected void updateItem(Transaccion transaccion, boolean empty){
        super.updateItem(transaccion, empty);
        if (empty){
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/cliente/TransaccionesMovil.fxml"));
            TransaccionMovilControlador controlador = new TransaccionMovilControlador(transaccion);
            loader.setController(controlador);
            setText(null);
            try {
                setGraphic(loader.load());
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
