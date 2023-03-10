public class IteradorMenuGeneral implements IteradorMenu {

    private Hamburguesa[] hamburguesas;
    private int posicion;

    public IteradorMenuGeneral(Hamburguesa[] hamburguesas) {
        this.hamburguesas = hamburguesas;
        this.posicion = 0;
    } 

    public Hamburguesa next() {
        Hamburguesa siguiente = null;
        if (hasNext()) {
            siguiente = hamburguesas[posicion++];
        }
        return siguiente;
        
    }

    public boolean hasNext() {   
        return posicion < hamburguesas.length;
    }

}






