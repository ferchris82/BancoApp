package bancoApp.modelos;

import bancoApp.vistas.FabricaVista;

public class Modelo {
    private static Modelo modelo;
    private final FabricaVista fabricaVista;

    private Modelo() {
        this.fabricaVista = new FabricaVista();
    }

    public static synchronized Modelo getInstance() {
        if (modelo == null) {
            modelo = new Modelo();
        }
        return modelo;
    }

    public FabricaVista getFabricaVista(){
        return fabricaVista;
    }
}
