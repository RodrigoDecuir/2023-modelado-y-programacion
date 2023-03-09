import java.util.Iterator;

public class MenuEspecial {
 
    private Hashtable<Integer, Hamburguesa> hamburguesas = new Hashtable<>();

    public MenuEspecial() {
        hamburguesas = new Hashtable<Integer, Hamburguesa>();
    }

    public IteradorMenu crearIterador() {
        return hamburguesas.values().iterator();
    }
}
