import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Hamburguesa {

    int id;
    String nombre;
    String descripcion;
    Double precio;
    boolean tieneQueso;
    boolean vegetariana;

    void addProtein(){};
    void addVegetals(){};
    void addCheese(){};

    void addBread() {
        System.out.println("Agregando pan... ");
    }

    boolean customerWantsVegetals = true;

    boolean customerWantsCheese = true;

    public final void prepareBase() {
        addBread();

        // Abstracts
        preparingProtein();
        addProtein();       // Carnes
        addMayonnaise();
        addKetchup();
        addMustard();

        // Hooks
        if (customerWantsVegetals) {
            addVegetals();     
        }
        if (customerWantsCheese) {
            addCheese();
        }
    }


    // Metodo que recibe una pregunta y regresa la respues del cliente
    public String getUserInput(String question) {
        String answer = null;
        // imprime pregunta
        System.out.print(question);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Recibe respuesta
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }

}
