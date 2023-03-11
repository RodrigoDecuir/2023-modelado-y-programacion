import java.util.ArrayList;
import java.util.Iterator;

/** 
 * Clase que contiene las listas de hamburguesas y sus respectivos iteradores.
 *
 * @author tukuwanaminaku
 */
public class Menu {

    /** Lista de hamburguesas para el menu general. */
    private ArrayList<Hamburguesa> menuGeneral;
    /** Lista de hamburguesas para el menu del dia. */
    private ArrayList<Hamburguesa> menuDelDia;
    /** Lista de hamburguesas para el menu especial. */
    private ArrayList<Hamburguesa> menuEspecial;
    /** Nombre del menu. */
    private String nombre;

    /**
     * Constructor con el nombre del menu y las listas de hamburguesas vacias.
     * 
     * @param nombre Nombre del menu.
     */
    public Menu(String nombre) {
        this.menuGeneral = new ArrayList<Hamburguesa>();
        this.menuDelDia = new ArrayList<Hamburguesa>();
        this.menuEspecial = new ArrayList<Hamburguesa>();
        this.nombre = nombre;
    }

    /** 
     * Agrega una hamburguesa el menu general.
     *
     * @param hamburguesa Hamburguesa que se va a agregar. 
     */
    public void agregarHamburguesaGeneral(Hamburguesa hamburguesa) {
        menuGeneral.add(hamburguesa);
    }

    /**
     * Agrega una hamburguesa al menu del dia.
     *
     * @param hamburguesa Hamburguesa que se va a agregar. 
     */
    public void agregarHamburguesaDelDia(Hamburguesa hamburguesa) {
        menuDelDia.add(hamburguesa);
    }

    /**
     * Agrega una hamburguesa al menu especial.
     *
     * @param hamburguesa Hamburguesa que se va a agregar. 
     */
    public void agregarHamburguesaEspecial(Hamburguesa hamburguesa) {
        menuEspecial.add(hamburguesa);
    }

    /**
     * Devuelve el iterador para recorrer el menu general. 
     *
     * @return iterador para recorrer el menu general.
     */
    public Iterator<Hamburguesa> getIteratorGeneral() {
        return menuGeneral.iterator();
    }
    
    /**
     * Devuelve el iterador para recorrer el menu del dia.
     * 
     * @return iterador para recorrer el menu del dia.
     */
    public Iterator<Hamburguesa> getIteratorDelDia() {
        return menuDelDia.iterator();
    }

    /**
     * Devuelve el iterador para recorrer el menu especial.
     * 
     * @return iterador para recorrer el menu especial.
     */
    public Iterator<Hamburguesa> getIteratorEspecial() {
        return menuEspecial.iterator();
    }
    
    public void mostrarHamburguesas() {
        for(Hamburguesa hamburguesa : hamburguesas) {
            System.out.println("ID" + hamburguesas.id);
            System.out.println("Nombre: " + hamburguesa.nombre);
            System.out.println("Descripcion: " + hamburguesa.descripcion);
            System.out.println("Precio: " + hamburguesa.precio);
            System.out.println("-----------");
        }
    }
}
