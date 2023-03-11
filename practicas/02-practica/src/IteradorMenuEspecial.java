import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Clase que implementa la interfaz IteradorMenu para recorrer las hamburguesas del menu especial.  
 *
 * @author tukuwanaminaku
 */
public class IteradorMenuEspecial implements IteradorMenu {

    /** Hashtable de hamburguesas a recorrer. */ 
    private Hashtable<Integer, Hamburguesa> hamburguesas = new Hashtable<>();
    /** Enumeracion de los valores de la Hashtable. */
    private Enumeration<Hamburguesa> enumeration;

    /**
     * Constructor que inicializa las hamburguesas y la enumeracion para poder regresar los objetos hamburguesa.  
     * 
     * @param hamburguesas Hashtable de hamburguesas que se van a recorrer.
     */
    public IteradorMenuEspecial(Hashtable<Integer, Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
        this.enumeration = hamburguesas.elements();
    }

    /** 
     * Regresa la siguiente hamburguesa en la enumeracion.
     * 
     * @return Siguiente hamburguesa en la enumeracion o null si ya no hay. 
     */
    public Hamburguesa next() {
        if (hasNext()) {
            return enumeration.nextElement();
        }
        return null;
    }
    
    /**
     * Verifica si aun hay elementos en enumeracion. 
     * 
     * @return True si hay un siguiente elemento y false de lo contrario. 
     */
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    /**
     * Reinicia el iterador.
     */
    public void reset() {
        this.enumeration = hamburguesas.elements();
    }

}
