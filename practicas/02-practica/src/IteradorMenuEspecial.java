import java.util.Enumeration;

public class IteradorMenuEspecial implements IteradorMenu {
    
    public Hashtable<Integer, Hamburguesa> hamburguesas;
    public Enumeration<Hamburguesa> enumeration;

    public IteradorMenuEspecial(Hashtable<Integer, Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
        this.enumeration = hamburguesas.elements();
    }

    public Hamburguesa next() {
        if (hasNext()) {
            return enumeration.nextElement();
        }
        return null;
    }
    
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }
}
