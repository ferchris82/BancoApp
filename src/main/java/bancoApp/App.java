package bancoApp;

import bancoApp.modelos.Modelo;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) {
        Modelo.getInstance().getFabricaVista().showLoginWindow();
    }
}
