public class IteradorMenuGeneral implements IteradorMenu {

    private Hamburguesa[] hamburguesas;
    private int posicion;

    public IteradorMenuGeneral(Hamburguesa[] hamburguesas) {
        this.hamburguesas = hamburguesas;
        this.posicion = 0;
    } 

    public boolean hasNext() {
        return posicion < hamburguesas.length;
    }

    public Hamburguesa next() {
        if (hasNext()) {
            Hamburguesa hamburguesa = hamburguesa[posicion];
            posicion++;
            return hamburguesa;
        }
        return null;
    }
}






