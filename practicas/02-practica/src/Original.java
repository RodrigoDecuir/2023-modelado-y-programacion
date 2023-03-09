public class Original implements Hamburgeusas {

    public Original () {
        id = 001;
        nombre = "Original";
        descripcion = "Es una hamburguesa... ";
        precio = 50.00;=
        tieneQueso = true;
        vegetariana = false;
    }

    public void preparingProtein () {
        System.out.println("Preparando carne original... ");
    }

    public void addProtein () {
        System.out.println("Agregando carne original... ");
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