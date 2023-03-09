public class Barret implements Hamburguesas {

    public Barret () {
        id = 002;
        nombre = "Barret";
        descripcion = "Es una hamburguesa estilo Barret... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = true;
    }

    public void preparingProtein () {
        System.out.println("Preparando carne vegetariana estilo Barret... ");
    }

    public void addProtein () {
        System.out.println("Agregando carne vegetariana estilo Barret... ");
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