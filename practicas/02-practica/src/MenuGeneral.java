public class MenuGeneral {

    private Hamburguesa[] hamburguesas;

    public void agregarHamburguesa(int posicion, Hamburguesa hamburguesa) {
        hamburguesas[posicion] = hamburguesa;
    }

    public IteradorMenu crearIterador() {
        return new IteradorMenuGeneral(hamburguesas);
    }
}
