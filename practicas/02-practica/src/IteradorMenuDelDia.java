import java.util.ArrayList;

public class IteradorMenuDelDia implements IteradorMenu {
    private ArrayList<Hamburguesa> hamburguesas;
    private int posicion;

    public IteradorMenuDelDia(ArrayList<Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
        this.posicion = 0;
    }

    public Hamburguesa next() {
        if (hasNext()) {
            Hamburguesa hamburguesa = hamburguesas.get(posicion);
            posicion++;
            return hamburguesa;
        }
        return null;
    }

    public Hamburguesa hasNext() {
        return new IteradorMenuDelDia(hamburguesas);
    }
}
