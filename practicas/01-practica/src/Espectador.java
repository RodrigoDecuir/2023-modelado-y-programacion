import java.io*;

/**
 * Clase para representar al espectador del escenario. 
 * @author tukuwanaminaku
 */
public class Espectador implements Observador {

    private String id_Espectador;
    private String apuesta;
    private Escenario castilloDePeach;
    private String movimiento;

    /**
     * Constructor para inicializar las variables.
     */ 
    public Espectador(String id_Espectador, String apuesta, Escenario castilloDePeach) {
        this.id_Espectador = id_Espectador;
        this.apuesta = apuesta;
        this.castilloDePeach = castilloDePeach;
        castilloDePeach.registrar(this);
        movimiento = castilloDePeach.obtenerMovimiento;
    }

    /**
     * Metodo para enviar al espectador el movimiento actual o mas reciente del combate.
     */
    @Override
    public void actualizar() {
        movimiento = castilloDePeach.obtenerMovimiento; 
        verMovimiento();
    }
    
    /**
     * Metodo que permite ver el id del espectador. 
     * @return id del espectador 
     */
    public String obtenerId_Espectador() {
        return id_Espectador; 
    }

    /**
     * Metodo que permite ver la apuesta realizada por el espectador. 
     * @return apuesta realizada por el espectador  
     */
    public String obtenerApuesta() {
        return apuesta; 
    }
    
    /**
     * Metodo que saca al espectador del escenario.  
     */
    public void sacarDelEscenario() {
        castilloDePeach.remover(this);  
    }

    /**
     * Metodo que muestra informacion del espectador y movimientos de la batalla. 
     */
    public void verMovimiento() {
        System.out.println("APUESTA: " + apuesta
               + "\nESPECTADOR: " + id_Espectador
               + "\nINFORMACION DEL COMBATE: \n" + movimiento); 
    }
}
