public class Hendrix extends Hamburguesa {

    public Hendrix() {
        id = 9;
        nombre = "Hendrix";
        descripcion = "Es una hamburguesa estilo Hendrix... ";
        precio = 70.00;
        tieneQueso = true;
        vegetariana = false;
    }

    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo Hendrix... ");
    }

    public void addProtein () {
        System.out.println("Agregando mini carne estilo Hendrix... ");
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