/**
 * Subclase de Hamburguesa.
 * 
 * @author tukuwanaminaku
 */
public class Mercury extends Hamburguesa {

    /** 
     * Constructor para inicializar los atributos.
     */
    public Mercury () {
        id = 006;
        nombre = "Mercury";
        descripcion = "Es una hamburguesa estilo Mercury... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = false;
    }

    /**
     * Metodo para preparar carne.
     */
    public void preparingProtein () {
        System.out.println("Preparando carne estilo Mercury... ");
    }

    /**
     * Metodo para agregar carne.
     */
    public void addProtein () {
        System.out.println("Agregando carne estilo Mercury... ");
    }

    /**
     * Metodo para ver si lleva vegetales.
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
     * Metodo para ver si lleva queso. 
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
