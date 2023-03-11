import java.util.ArrayList;

/**
 * Clase que representa la coleccion de hamburguesas del menu del dia.
 * @author tukuwanaminaku
 */
public class MenuDelDia {

    /** Lista de hamburguesas.*/
    private ArrayList<Hamburguesa> hamburguesas;
    
    /** 
     * Constructor de MenuDelDia que crea un objeto con una lista vacia de hamburguesa Constructor de MenuDelDia que crea un objeto con una lista vacia de hamburguesas.
     */
    public MenuDelDia() {
        hamburguesas = new ArrayList<Hamburguesa>();
    }
    /**
     * Crea un nuevo objeto IteradorMenu para el menu del dia.
     * 
     * @return nuevo objeto IteradorMenu para el menu del dia.
     */
    public IteradorMenu crearIterador() {
        return new IteradorMenuDelDia(hamburguesas);
    }
}
