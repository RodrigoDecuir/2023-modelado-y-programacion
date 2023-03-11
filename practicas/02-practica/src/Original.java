/**
 * Subclase de Hamburguesa.
 *
 * @author tukuwanaminaku
 */
public class Original extends Hamburguesa {

    /**
     * Constructor para inicializar los atributos.
     */
    public Original () {
        id = 001;
        nombre = "Original";
        descripcion = "Es una hamburguesa estilo original... ";
        precio = 50.00;
        tieneQueso = true;
        vegetariana = false;
    }

    /**
     * Metodo para preparar carne.
     */
    public void preparingProtein () {
        System.out.println("Preparando carne original... ");
    }

    /**
     * Metodo para agregar carne.
     */
    public void addProtein () {
        System.out.println("Agregando carne original... ");
    }

    /**
     * Metodo para ver si lleva vegetales.
     */
    public boolean customerWantsVegetals() {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
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
            return true;
        } else {
            return false;
        }
    }

}
