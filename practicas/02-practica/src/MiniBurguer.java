/**
 * Subclase de Hamburguesa. 
 *
 * @author tukuwanaminaku
 */
public class MiniBurguer extends Hamburguesa {

    /**
     * Constructor para inicializar los atributos.
     */
    public MiniBurguer () {
        id = 003;
        nombre = "MiniBurguer";
        descripcion = "Es una hamburguesa estilo MiniBurguer... ";
        precio = 50.00;
        tieneQueso = true;
        vegetariana = false;
    }

    /**
     * Metodo para preparar carne.
     */
    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo MiniBurguer... ");
    }

    /**
     * Metodo para agregar carne.
     */
    public void addProtein () {
        System.out.println("Agregando mini carne estilo MiniBurguer... ");
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
