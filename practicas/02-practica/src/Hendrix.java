/**
 * Subclase de Hamburguesa.
 * 
 * @author tukuwanaminaku
 */
public class Hendrix extends Hamburguesa {

    /**
     * Constructor que inicializa los atributos de la hamburguesa.
     */
    public Hendrix() {
        id = 9;
        nombre = "Hendrix";
        descripcion = "Es una hamburguesa estilo Hendrix... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = false;
    }

    /**
     * Metodo para preparar la carne.
     */
    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo Hendrix... ");
    }

    /**
     * Metodo para agregar la carne.
     */
    public void addProtein () {
        System.out.println("Agregando mini carne estilo Hendrix... ");
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
