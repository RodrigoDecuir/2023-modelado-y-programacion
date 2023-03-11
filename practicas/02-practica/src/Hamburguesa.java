import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Clase abstracta para implementar Template.
 * 
 * @author tukuwanaminaku
 */
public abstract class Hamburguesa {

    /** */
    int id;
    /** */
    String nombre;
    /** */
    String descripcion;
    /** */
    Double precio;
    /** */
    boolean tieneQueso;
    /** */
    boolean vegetariana;

    /** */
    public final void prepareHamburguer() {
        addBread();
        preparingProtein();
        addProtein();
        // Hooks
        if (customerWantsVegetals()) {
            addVegetals();     
        }
        if (customerWantsCheese()) {
            addCheese();
        }
        
        addMayonnaise();
        addKetchup();
        addMustard();
    }

    /** */
    void addVegetals() {
        System.out.println("Agregando vegentales... ");
    }
  
    /** */
    void addCheese() {
        System.out.println("Agregando queso... ");
    }
 
    /** */
    void addBread() {
        System.out.println("Agregando pan... ");
    }
  
    /** */
    void addMayonnaise() {
        System.out.println("Agregando mayonesa... ");
    }

    /** */
    void addKetchup() {
        System.out.println("Agregando katsup... ");
    }

    /** */
    void addMustard() {
        System.out.println("Agregando mostaza... ");
    }

    /** */
    boolean customerWantsCheese() {
        return true;
    }

    /** */
    boolean customerWantsVegetals() {
        return true;
    }

    /** */
    abstract void preparingProtein();
  
    /** */
    abstract void addProtein();

    /**
     * Metodo que recibe una pregunta y regresa la respuesta del cliente. 
     *
     */
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
