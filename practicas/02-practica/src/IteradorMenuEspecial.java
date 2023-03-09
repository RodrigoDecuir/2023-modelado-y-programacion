import java.util.Enumeration;

public class IteradorMenuEspecial implements IteradorMenu {
    
    private Hashtable<Integer, Hamburguesa> hamburguesas = new Hashtable<>();
    private Enumeration<Hamburguesa> enumeration;

    public IteradorMenuEspecial(Hashtable<Integer, Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
        this.enumeration = hamburguesas.elements();
    }

    public Hamburguesa next() {
        if() {
             
        }

        //if (hasNext()) {
         //   return enumeration.nextElement();
        //}
        //return null;
    }
    
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }
}
