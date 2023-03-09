public class MenuEspecial {
 
    private Hashtable<Integer, Hamburguesa> hamburguesas;

    public MenuEspecial() {
        hamburguesas = new Hashtable<Integer, Hamburguesa>();
    }

    public IteradorMenu crearIterador() {
        return new IteradorMenuEspecial(hamburguesas);
    }
}
