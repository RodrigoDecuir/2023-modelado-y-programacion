public class MiniBurguer extends Hamburguesa {

    public MiniBurguer () {
        id = 003;
        nombre = "MiniBurguer";
        descripcion = "Es una hamburguesa estilo MiniBurguer... ";
        precio = 50.00;
        tieneQueso = true;
        vegetariana = false;
    }

    public void preparingProtein () {
        System.out.println("Preparando mini carne estilo MiniBurguer... ");
    }

    public void addProtein () {
        System.out.println("Agregando mini carne estilo MiniBurguer... ");
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
