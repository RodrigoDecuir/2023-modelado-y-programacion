import java.util.ArrayList;

/**
 * Clase que implementa la interfaz IteradorMenu para recorrer las hamburguesas del menu del dia.
 * 
 * @author tukuwanaminaku
 */
public class IteradorMenuDelDia implements IteradorMenu {

    /** Lista de hamburguesas del menu. */
    private ArrayList<Hamburguesa> hamburguesas;
    /** Posicion del iterador en la lista. */
    private int posicion ;

    /** 
     * Constructor que inicializa las hamburguesas y la posicion del iterador.
     *
     * @param hamburguesas Lista de hamburguesas del menu. 
     */
    public IteradorMenuDelDia(ArrayList<Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
        this.posicion = 0;
    }

    /**
     * Regresa la siguiente hamburguesa y avanza a una posicion en el iterador. 
     *  
     * @return Siguiente hamburguesa en la lista o null en caso de que ya no haya. 
     */
    public Hamburguesa next() {
        if (hasNext()) {
            Hamburguesa hamburguesa = hamburguesas.get(posicion);
            posicion++;
            return hamburguesa;
        }
        return null;
    }

    /**
     * Verifica si aun hay elementos en la lista.
     *
     * @return True o false dependiendo del elemento consecuente. 
     */
    public boolean hasNext() {
        return posicion <= hamburguesas.size() -1;
    }
   
    /**
     * Reinicia el iterador.
     */ 
    public void reset() {
        this.posicion = 0;
    }
}
