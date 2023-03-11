/**
 * Clase que representa la coleccion de hamburguesas del menu general.
 *
 * @author tukuwanaminaku
 */
public class MenuGeneral {
    
    /** Arreglo de hamburguesas. */
    private Hamburguesa[] hamburguesas;

    /**
     * Constructor que inicializa el arreglo de hamburguesas.
     *
     * @param t tamanio del arreglo
     */
    public MenuGeneral(int t) {
        hamburguesas = new Hamburguesa[t];
    }

    /**
     * Agrega una hamburguesa en una posicion del arreglo. 
     *
     * @param posicion para agregar la hamburguesa.
     * @param hamburguesa hamburguesa que se agrega.
     */
    public void agregarHamburguesa(int posicion, Hamburguesa hamburguesa) {
        hamburguesas[posicion] = hamburguesa;
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
