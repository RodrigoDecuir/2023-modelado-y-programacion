/**
 *
 * @author tukuwanaminaku
 */
public class Lennon extends Hamburguesa {

    /** */
    public Lennon () {
        id = 007;
        nombre = "Lennon";
        descripcion = "Es una hamburguesa estilo Lennon... ";
        precio = 60.00;
        tieneQueso = true;
        vegetariana = true;
    }

    /** */
    public void preparingProtein () {
        System.out.println("Preparando carne vegetariana estilo Lennon... ");
    }

    /** */
    public void addProtein () {
        System.out.println("Agregando carne vegetariana estilo Lennon... ");
    }

    /** */
    public boolean customerWantsVegetals () {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            System.out.println("Agregando vegetales... ");
            return true;
        } else {
            return false;
        }
    }

    /** */
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
