import java.util.Iterator;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Clase que representa la coleccion de hamburguesas del menu especial.
 *
 * @author tukuwanaminaku
 */
public class MenuEspecial {
 
    /** Hashtable para almacenar las hamburguesas */
    private Hashtable hamburguesas = new Hashtable<Integer, Hamburguesa>();

    /** 
     * Constructor que crea una Hashtable vacia para guardar las hamburguesas.
     */
    public MenuEspecial() {
        /*
        Lennon lennon = new Lennon();
        Bowie bowie = new Bowie();
        Hendrix hendrix = new Hendrix();
        
        hamburguesas.put(lennon.getID, lennon);
        hamburguesas.put(bowie.getID, bowie);
        hamburguesas.put(hendrix.getID, hendrix);
        */
    }

    /*
    public void muestraHamburguesas() {
        Enumeration<Integer> setOfKeys = hamburguesas.keys();
        
        while (setOfKeys.hasMoreElements()) {
            Hamburguesa hamburguesa = hamburguesas.get(setOfKeys);
            hamburguesa.printInfo();

            int key = setOfKeys.nextElement();
        }
    }

    public Hamburguesa buscaHamburguesa(int id) {
        Enumeration<Integer> setOfKeys = hamburguesas.keys();
        
        while (setOfKeys.hasMoreElements()) {
            Hamburguesa hamburguesa = hamburguesas.get(setOfKeys);
            if (id == key) {
                return hamburguesa;
            }
            int key = setOfKeys.nextElement();
        }
    }
    */

    /**
     * Crea un nuevo objeto IteradorMenu para el menu especial.
     *
     * @return nuevo objeto IteradorMenu para el menu especial.
     */
    public IteradorMenu crearIterador() {
        return new IteradorMenuEspecial(hamburguesas);
    }
}
