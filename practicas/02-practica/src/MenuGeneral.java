import java.util.Iterator;

/**
 * Clase que representa la coleccion de hamburguesas del menu general.
 *
 * @author tukuwanaminaku
 */
public class MenuGeneral {
    
    /** Arreglo de hamburguesas. */
    private Hamburguesa[] hamburguesas = new Hamburguesa[3];

    /**
     * Constructor que inicializa el arreglo de hamburguesas.
     *
     * @param t tamanio del arreglo
     */
    public MenuGeneral() {
        Marley marley = new Marley();
        Mercury mercury = new Mercury();
        McCartney mcCartney = new McCartney();
        hamburguesas[0] = marley;
        hamburguesas[1] = mercury;
        hamburguesas[2] = mcCartney;
    }

    public void muestraHamburguesas() {
        int i;
        for (i =0; i <hamburguesas.length; i++) {
            hamburguesas[i].printInfo();
        }
    }

    public Hamburguesa busca(int id) {
        int i;
        for (i =0; i <hamburguesas.length; i++) {
            if (hamburguesas[i].getID() == id) {
                return hamburguesas[i];
            }
        }

        System.out.println("Opcion no valida");
        return null;
    }

    /**
     * Crea un nuevo objeto IteradorMenu para el menu general.
     * 
     * @return nuevo objeto Iterador para el menu general.
     */
    public IteradorMenu crearIterador() {
        return new IteradorMenuGeneral(hamburguesas);
    }
}
