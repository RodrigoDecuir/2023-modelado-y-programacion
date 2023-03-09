public class Lennon extends Hamburguesas {

    public Lennon () {
        id = 007;
        nombre = "Lennon";
        descripcion = "Es una hamburguesa estilo Lennon... ";
        precio = 60.00;
        tieneQueso = true;
        vegetariana = true;
    }

    public void preparingProtein () {
        System.out.println("Preparando carne vegetariana estilo Lennon... ");
    }

    public void addProtein () {
        System.out.println("Agregando carne vegetariana estilo Lennon... ");
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
