/**
 *
 *
 * @author tukuwanaminaku
 */
public class McCartney extends Hamburguesa {

    public McCartney () {
        id = 005;
        nombre = "McCartney";
        descripcion = "Es una hamburguesa estilo McCartney... ";
        precio = 65.00;
        tieneQueso = true;
        vegetariana = false;
    }

    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo McCartney... ");
    }

    public void addProtein () {
        System.out.println("Agregando mini carne estilo McCartney... ");
    }

    public boolean customerWantsVegetals () {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            System.out.println("Agregando vegetales... ");
            return true;
        } else {
            return false;
        }
    }

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
