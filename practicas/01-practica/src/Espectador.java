import java.io*;

/**
 * Clase para representar al espectador del combate. 
 * @author tukuwanaminaku
 */
public class Espectador() {
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
        this.movimiento = movimiento;
    }
    /**
     * Metodo para enviar al espectador el movimiento actual o mas reciente del combate.
     */
    @Override
    public void actualizar() {
         
    }
    
    /**
     *
     */
    public String obtenerId_Espectador() {
        return id_Espectador; 
    }

    /**
     *
     */
    public String obtenerApuesta() {
        return apuesta; 
    }
    
    /**
     * 
     */
    public void verMovimiento() {
     
    }
}
