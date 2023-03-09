public class Bowie extends Hamburguesa {

    public Bowie () {
        id = 8;
        nombre = "Bowie";
        descripcion = "Es una hamburguesa estilo Bowie... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = false;
    }

    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo Bowie... ");
    }

    public void addProtein () {
        System.out.println("Agregando mini carne estilo Bowie... ");
    }

    public boolean customerWantsVegetals () {
        String answer = getUserInput("Quiere vegetales? ");
        
        if (answer.toLowerCase().startsWith("y")) {
            addVegetals();
            return true;
        } else {
            return false;
        }
    }

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
