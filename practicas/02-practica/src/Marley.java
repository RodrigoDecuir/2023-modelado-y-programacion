/**
 * Clase que extiende de la clase abastracta Hamburguesa. 
 *
 * @author tukuwanaminaku
 */
public class Marley extends Hamburguesa {

    /**
     * Constructor que inicializa los atributos de la hamburguesa.
     */
    public Marley () {
        id = 004;
        nombre = "Marley";
        descripcion = "Es una hamburguesa estilo Marley... ";
        precio = 60.00;
        tieneQueso = true;
        vegetariana = true;
    }

    /**
     * Metodo para preparar la carne vegetariana.
     */
    public void preparingProtein () {
        System.out.println("Preparando carne vegetariana estilo Marley... ");
    }

    /**
     * Metodo para agregar la carne vegetariana.
     */
    public void addProtein () {
        System.out.println("Agregando carne vegetariana estilo Marley... ");
    }

    /**
     * Metodo para verificar si la hamburguesa lleva vegetales.
     * 
     * @return true o false
     */
    public boolean customerWantsVegetals () {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            System.out.println("Agregando vegetales... ");
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para verificar si la hamburguesa lleva queso.
     * 
     * @return true o false
     */
    public boolean customerWantsCheese () {
        String answer = getUserInput("Quiere queso? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            System.out.println("Agregando queso... ");
            return true;
        } else {
            return false;
        }
    }

}
