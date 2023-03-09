import java.util.ArrayList;

public class Menu {

    // Atributos
    private ArrayList<Hamburguesa> menuGeneral;
    private ArrayList<Hamburguesa> menuDelDia;
    private ArrayList<Hamburguesa> menuEspecial;
    private String nombre;

    // Constructor
    public Menu(String nombre) {
        this.menuGeneral = new ArrayList<Hamburguesa>();
        this.menuDelDia = new ArrayList<Hamburguesa>();
        this.menuEspecial = new ArrayList<Hamburguesa>();
        this.nombre = nombre;
    }

    // Métodos para agregar hamburguesas a cada menú
    public void agregarHamburguesaGeneral(Hamburguesa hamburguesa) {
        menuGeneral.add(hamburguesa);
    }

    public void agregarHamburguesaDelDia(Hamburguesa hamburguesa) {
        menuDelDia.add(hamburguesa);
    }

    public void agregarHamburguesaEspecial(Hamburguesa hamburguesa) {
        menuEspecial.add(hamburguesa);
    }

    // Métodos para obtener los iteradores de cada menú
    public Iterator<Hamburguesa> getIteratorGeneral() {
        return menuGeneral.iterator();
    }

    public Iterator<Hamburguesa> getIteratorDelDia() {
        return menuDelDia.iterator();
    }

    public Iterator<Hamburguesa> getIteratorEspecial() {
        return menuEspecial.iterator();
    }
}
