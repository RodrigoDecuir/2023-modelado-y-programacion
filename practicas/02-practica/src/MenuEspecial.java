import java.util.Iterator;
import java.util.Hashtable;

/**
 * Clase que representa la coleccion de hamburguesas del menu especial.
 *
 * @author tukuwanaminaku
 */
public class MenuEspecial {
 
    /** Hashtable para almacenar las hamburguesas */
    private Hashtable<Integer, Hamburguesa> hamburguesas = new Hashtable<>();

    /** 
     * Constructor que crea una Hashtable vacia para guardar las hamburguesas.
     */
    public MenuEspecial() {
        hamburguesas = new Hashtable<Integer, Hamburguesa>();
    }

    /**
     * Crea un nuevo objeto IteradorMenu para el menu especial.
     *
     * @return nuevo objeto IteradorMenu para el menu especial.
     */
    public IteradorMenu crearIterador() {
        return new IteradorMenuEspecial(hamburguesas);
    }
}
