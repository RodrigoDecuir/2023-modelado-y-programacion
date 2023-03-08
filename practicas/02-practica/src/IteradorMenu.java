/**
 * Interfaz que define los metodos que 
 * deben implementar los iteradores de cada tipo de menu.
 * @author tukuwanaminaku
 */
public interface IteradorMenu {
	/** indica si existe otro elemento en el menu que aun no haya sido iterado */
    public boolean hasNext();
	/** devuelve el siguiente elemento del menu */
    public Hamburguesa next();
	/** permite reiniciar la iteracion desde el principio del menu */
    public void reset();
}

