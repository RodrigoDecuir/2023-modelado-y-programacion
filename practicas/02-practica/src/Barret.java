/**
 * Subclase de Hamburguesa.
 *
 * @author tukuwanaminaku
 */
public class Barret extends Hamburguesa {

    /**
     * Metodo constructor para inicializar los atributos.
     */
    public Barret () {
        id = 002;
        nombre = "Barret";
        descripcion = "Es una hamburguesa estilo Barret... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = true;
    }
    
    /**
     * Metodo para preprar carne vegetariana.
     */
    public void preparingProtein () {
        System.out.println("Preparando carne vegetariana estilo Barret... ");
    }

    /**
     * Metodo para agregar carne vegetariana.
     */
    public void addProtein () {
        System.out.println("Agregando carne vegetariana estilo Barret... ");
    }

    /**
     * Metodo para ver si la hamburguesa lleva vegetales.
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
     * Metodo para ver si la hamburguesa lleva queso.
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
