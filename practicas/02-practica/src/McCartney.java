public class McCartney extends Hamburguesas {

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
        String Answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            return true;
            System.out.println("Agregando vegetales... ");
        } else {
            return false;
        }
    }

    public boolean customerWantsCheese () {
        String Answer = getUserInput("Quiere queso? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            return true;
            System.out.println("Agregando queso... ");
        } else {
            return false;
        }
    }

}
