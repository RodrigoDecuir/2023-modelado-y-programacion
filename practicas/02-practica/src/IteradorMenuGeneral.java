/**
 * Clase que implementa la interfaz IteradorMenu para recorrer el menu general.
 *
 * @author tukuwanaminaku
 */
public class IteradorMenuGeneral implements IteradorMenu {

    /** Arreglo de hamburguesas. */
    private Hamburguesa[] hamburguesas;
    /** Posicion del iterador. */
    private int posicion;

    /**
     * Constructor que inicializa las hamburguesas y la posicion del iterador.
     * 
     * @param hamburguesas Arreglo de hamburguesas. 
     */
    public IteradorMenuGeneral(Hamburguesa[] hamburguesas) {
        this.hamburguesas = hamburguesas;
        this.posicion = 0;
    } 

    /** 
     * Regresa la siguiente hamburguesa y avanza una posicion en el arreglo. 
     * 
     * @return Siguiente hamburguesa en la lista o null en caso de que ya no haya.
     */
    public Hamburguesa next() {
        Hamburguesa siguiente = null;
        if (hasNext()) {
            siguiente = hamburguesas[posicion++];
        }
        return siguiente;
        
    }

    /**
     * Verifica si aun hay elementos en la lista.
     * 
     * @return True o false dependiendo del elemento consecuente.
     */
    public boolean hasNext() {   
        return posicion < hamburguesas.length;
    }

    /** 
     * Reinicia el iterador.
     */
    public void reset() {
        this.posicion = 0;
    }

}
