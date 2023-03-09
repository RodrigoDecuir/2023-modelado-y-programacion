import java.util.ArrayList;

public class MenuDelDia {

    private ArrayList<Hamburguesa> hamburguesas;

    public MenuDelDia() {
        hamburguesas = new ArrayList<Hamburguesa>();
    }

    public IteradorMenu crearIterador() {
        return new IteradorMenuDelDia(hamburguesas);
    }
}
