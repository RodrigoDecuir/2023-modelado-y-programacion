public class Original extends Hamburguesa {

    public Original () {
        id = 001;
        nombre = "Original";
        descripcion = "Es una hamburguesa estilo original... ";
        precio = 50.00;
        tieneQueso = true;
        vegetariana = false;
    }

    public void preparingProtein () {
        System.out.println("Preparando carne original... ");
    }

    public void addProtein () {
        System.out.println("Agregando carne original... ");
    }

    public boolean customerWantsVegetals() {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean customerWantsCheese () {
        String answer = getUserInput("Quiere queso? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

}
