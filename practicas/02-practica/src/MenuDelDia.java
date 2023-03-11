import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que representa la coleccion de hamburguesas del menu del dia.
 * @author tukuwanaminaku
 */
public class MenuDelDia {

    /** Lista de hamburguesas.*/
    private ArrayList<Hamburguesa> hamburguesas = new ArrayList<Hamburguesa>();
    
    /** 
     * Constructor de MenuDelDia que crea un objeto con una lista vacia de hamburguesa Constructor de MenuDelDia que crea un objeto con una lista vacia de hamburguesas.
     */
    public MenuDelDia() {
        Original original = new Original();
        Barret barret = new Barret();
        MiniBurguer miniBurguer = new MiniBurguer();
        hamburguesas.add(original);
        hamburguesas.add(barret);
        hamburguesas.add(miniBurguer);
    }

    /*
    private class Iterador implements IteradorMenu {

        public boolean tieneSiguiente() {
            return hamburguesas.iterator().hasNext();
        }

        public void siguiente() {
            hamburguesas.iterator().next();
        }

    }
    */

    public void agregar(Hamburguesa hamburguesa) {
        hamburguesas.add(hamburguesa);
    }

    public Hamburguesa busca(int id) {

        for (Hamburguesa hamburguesa : hamburguesas) {
            if (hamburguesa.getID() == id) {
                return hamburguesa;
            }
        }

        System.out.println("Opcion no valida");
        return null;
    }

    public void muestraHamburguesas() {
        for (Hamburguesa hamburguesa : hamburguesas) {
            hamburguesa.printInfo();
        }
    }

    /**
     * Crea un nuevo objeto IteradorMenu para el menu del dia.
     * 
     * @return nuevo objeto IteradorMenu para el menu del dia.
     */
    public Iterator crearIterador() {
        return hamburguesas.iterator();
    }
}
