import java.util.LinkedList;

/**
 * Clase que permite al espectador ver la batalla. 
 * @author tukuwanaminaku
 */
public class Escenario implements Sujeto {

    LinkedList<Espectador> espectadores = new LinkedList<Espectador>(); 
    //LinkedList<Personaje> personajes = new LinkedList<Personaje>(); 
    public String movimiento; 

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
    //public LinkedList<Personaje> getPersonajes() {
        //return personajes;
    //}
   
    /**
     * Metodo que regresa el movimiento actual.
     * @return movimiento actual
     */ 
    public String getMovimiento() {
        return movimiento; 
    }
    
    /**
     * Metodo que modifica los movimientos. 
     */
    public void setMovimiento(String nuevoMovimiento) {
        movimiento = nuevoMovimiento; 
    }
    
    /**
     * Metodo que registra un espectador al escenario.
     * @param b espectador por registrar 
     */
    public void registrar(Espectador b) {
        espectadores.add(b);
        System.out.println("************************"
               + "\nCastilloDePeach, el espectador " + b.getId_Espectador()
               + "ha apostado por el personaje " + b.getApuesta() + "\n"
               + "************************");
    }
    
    /**
     * Metodo que remueve a un espectador del escenario.
     * @param b espectador por remover
     */
    public void remover(Espectador b) {
        System.out.println("************************"
               + "\nCastilloDePeach, la apuesta a " + b.getApuesta()
               + " del espectador " + b.getId_Espectador()
               + " ha sido retirada.\n"
               + "************************");
        espectadores.remove(b);
    }
    
    /**
     * Metodo que notifica a los espectadores del escenario.
     */
    public void notificar() {
        if(espectadores.size() > 0) {
            System.out.println("************************"
               + "\n****Vista del espectador****\n"
               + "************************");
            for(Espectador b: espectadores) {
                b.actualizar();
            }
        }
    }
}
