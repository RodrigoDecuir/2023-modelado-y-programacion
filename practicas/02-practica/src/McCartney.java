/**
 * Subclase de Hamburguesa.
 *
 * @author tukuwanaminaku
 */
public class McCartney extends Hamburguesa {
    
    /** Constructor para inicializar los atributos. */
    public McCartney () {
        id = 005;
        nombre = "McCartney";
        descripcion = "Es una hamburguesa estilo McCartney... ";
        precio = 65.00;
        tieneQueso = true;
        vegetariana = false;
    }

    /** Metodo para prepara carne. */
    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo McCartney... ");
    }

    /** Metodo para agregar carne. */
    public void addProtein () {
        System.out.println("Agregando mini carne estilo McCartney... ");
    }

    /** Metodo para ver si lleva vegetales. */
    public boolean customerWantsVegetals () {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            System.out.println("Agregando vegetales... ");
            return true;
        } else {
            return false;
        }
    }

    /** Metodo para ver si lleva queso. */
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
