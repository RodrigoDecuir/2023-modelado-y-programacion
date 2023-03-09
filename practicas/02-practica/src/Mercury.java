public class Mercury extends Hamburguesa {

    public Mercury () {
        id = 006;
        nombre = "Mercury";
        descripcion = "Es una hamburguesa estilo Mercury... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = false;
    }

    public void preparingProtein () {
        System.out.println("Preparando carne estilo Mercury... ");
    }

    public void addProtein () {
        System.out.println("Agregando carne estilo Mercury... ");
    }

    public boolean customerWantsVegetals () {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            return true;
            System.out.println("Agregando vegetales... ");
        } else {
            return false;
        }
    }

    public boolean customerWantsCheese () {
        String answer = getUserInput("Quiere queso? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            return true;
            System.out.println("Agregando queso... ");
        } else {
            return false;
        }
    }

}
