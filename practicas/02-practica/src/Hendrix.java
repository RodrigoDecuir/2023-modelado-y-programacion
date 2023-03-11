/**
 *
 * 
 * @author tukuwanaminaku
 */
public class Hendrix extends Hamburguesa {

    /** */
    public Hendrix() {
        id = 9;
        nombre = "Hendrix";
        descripcion = "Es una hamburguesa estilo Hendrix... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = false;
    }

    /** */
    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo Hendrix... ");
    }

    /** */
    public void addProtein () {
        System.out.println("Agregando mini carne estilo Hendrix... ");
    }

    /** */
    public boolean customerWantsVegetals () {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            addVegetals();
            return true;
        } else {
            return false;
        }
    }

    /** */
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
