/**
 * Interfaz que define los metodos
 * necesarios para recorrer los menús. 
 *
 * @author tukuwanaminaku
 */
public interface IteradorMenu {
	/** indica si existe otro elemento en el menu que aun no haya sido iterado */
    public boolean hasNext();
	/** devuelve el siguiente elemento del menu */
    public Hamburguesa next();
	/** reinicia la iteracion del menu */
    //public void reset();
}
