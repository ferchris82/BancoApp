package bancoApp.vistas;

import bancoApp.controladores.admin.ControladorClienteMovil;
import bancoApp.modelos.Cliente;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

public class ClienteFabricaMovil extends ListCell<Cliente> {

    @Override
    protected void updateItem(Cliente cliente, boolean empty){
        super.updateItem(cliente, empty);
        if (empty){
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/admin/ClienteMovil.fxml"));
            ControladorClienteMovil controlador = new ControladorClienteMovil(cliente);
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
