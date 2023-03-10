import java.util.Iterator;
import java.util.Hashtable;

public class MenuEspecial {
 
    private Hashtable<Integer, Hamburguesa> hamburguesas = new Hashtable<>();

    public MenuEspecial() {
        hamburguesas = new Hashtable<Integer, Hamburguesa>();
    }

    public IteradorMenu crearIterador() {
        return new IteradorMenuEspecial(hamburguesas);
    }
}
