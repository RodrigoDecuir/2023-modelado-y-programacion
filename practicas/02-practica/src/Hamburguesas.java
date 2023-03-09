import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Hamburgeusas {

    int id;
    String nombre;
    String descripcion;
    Double precio;
    boolean tieneQueso;
    boolean vegetariana;

    final void prepareBase() {
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

    void addProtein(){};
    void addVegetals(){};
    void addCheese(){};

    void addBread() {
        System.out.println("Agregando pan... ");
    }

    boolean customerWantsVegetals() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }

    // Metodo que recibe una pregunta y regresa la respues del cliente
    private String getUserInput(String question) {
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