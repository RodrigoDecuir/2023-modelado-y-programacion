import java.util.ArrayList;

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
        Hamburguesa original = new Original();
        Hamburguesa berret = new Barret();
        Hamburguesa miniBurguer = new MiniBurguer();
        MenuDelDia.agrega(original);
        MenuDelDia.agrega(barret);
        MenuDelDia.agrega(miniBurguer);
    }

    private class Iterador implements IteradorMenu {

        public boolean tieneSiguiente() {
            return hamburguesas.iterator().hasNext();
        }

        public void siguiente() {
            hamburguesas.iterator().next();
        }

    }

    public void agregar(Hamburguesa hamburguesa) {
        hamburguesas.add(hamburguesa);
    }

    public Hamburguesa busca(int id) {
        boolean founded;
        for (Hamburguesa hamburguesa : hamburguesas) {
            if (Hamburguesa.getID == id) {
                founded = true;
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
    public Iterador crearIterador() {
        return hamburguesas.iterator();
    }
}
