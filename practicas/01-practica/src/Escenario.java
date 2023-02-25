import java.util.LinkedList;

/**
 * Clase para 
 * @author tukuwanaminaku
 */
public class Escenario implements Sujeto {

    LinkedList<Espectador> espectadores = new LinkedList<Espectador>(); 
    LinkedList<Personaje> personajes = new LinkedList<Personaje>(); 
    String movimientos; 

    /**
     * Metodo que regresa la lista de espectadores.
     * @return lista de espectadores
     */
    public LinkedList<Espectador> getEspectadores() {
        return espectadores;
    }

    /**
     * Metodo que regresa la lista de personajes.
     * @return lista de personajes
     */ 
    public LinkedList<Personaje> getPersonajes() {
        return personajes;
    }
   
    /**
     * Metodo que regresa el movimiento actual.
     * @return movimiento actual
     */ 
    public String getMovimientos() {
        return movimiento; 
    }
    
    /**
     * Metodo que modifica los movimientos. 
     */
    public void setMovimientos(String nuevoMovimiento) {
        movimiento = nuevoMovimiento; 
    }
    
    /**
     * Metodo que registra un espectador al escenario.
     * @param b espectador por registrar 
     */
    public void registrar(Espectador b) {
        espectador.add(b);
        System.out.println("************************"
               + "\nCastilloDePeach, el espectador " + b.obtenerId_Espectador()
               + "ha apostado por el personaje " + b.obtenerApuesta() + "\n"
               + "************************");
    }
    
    /**
     * Metodo que remueve a un espectador del escenario.
     * @param b espectador por remover
     */
    public void remover(Espectador b) {
        System.out.println("************************"
               + "\nCastilloDePeach, la apuesta a " c.obtenerApuesta()
               + " del espectador " + b.obtenerId_Espectador()
               + " ha sido retirada.\n"
               + "************************");
        espectador.remove(b);
    }
    
    /**
     * Metodo que notifica a los espectadores del escenario.
     */
    public void notificar() {
        if(espectador.size() > 0) {
            System.out.println("************************"
               + "\n****Vista del espectador****\n"
               + "************************");
            for(Espectador b: espectadores) {
                b.actualizar();
            }
        }
    }
}
