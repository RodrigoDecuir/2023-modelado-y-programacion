public class IteradorMenuDelDia implements IteradorMenu {
    private ArrayList<Hamburuesa> hamburguesas;
    private int posicion;

    public IteradorMenuDelDia(ArrayList<hamburguesa> hamburguesas) {
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
        if (hasNext()) {
            Hamburguesa hamburguesa = hamburguesas.get(posicion);
            posicion++;
            return hamburguesa;
        }
        return null;
    }
}
