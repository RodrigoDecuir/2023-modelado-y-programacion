/**
 * Subclase de Hamburguesa.
 *
 * @author tukuwanaminaku
 */
public class Bowie extends Hamburguesa {

    /** Constructor para incializar los atributos de la hamburguesa. */
    public Bowie () {
        id = 8;
        nombre = "Bowie";
        descripcion = "Es una hamburguesa estilo Bowie... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = false;
    }

    /** 
     * Metodo para preparar mini carne.
     */
    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo Bowie... ");
    }

    /** 
     * Metodo para agregar mini carne.
     */
    public void addProtein () {
        System.out.println("Agregando mini carne estilo Bowie... ");
    }

    /**
     * Metodo para ver si lleva vegetales.
     */
    public boolean customerWantsVegetals () {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            addVegetals();
            return true;
        } else {
            return false;
        }
    }

    /** 
     * Metodo para ver si lleva queso.
     */
    public boolean customerWantsCheese () {
        String answer = getUserInput("Quiere queso? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            addCheese();
            return true;
        } else {
            return false;
        }
    }

}
