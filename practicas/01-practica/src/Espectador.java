import java.io*;

/**
 * Clase para representar al espectador del combate. 
 * @author tukuwanaminaku
 */
public class Espectador() {
    private String id_Espectador;
    private String apuesta;
    private Escenario verEscenario;
    private String historia;
    private String movimiento;

    /**
     * Constructor para inicializar las variables.
     */ 
    public Espectador(String id_Espectador, String apuesta, Escenario castilloDePeach) {
        this.id_Espectador = id_Espectador;
        this.apuesta = apuesta;
        this.castilloDePeach = castilloDePeach;
    }
    /**
     * Metodo para  
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
    public String obtenerHistoria() {
        return historia;
    }
    
    /**
     * 
     */
    public void dejarDeVerEscenario() {
     
    }
}
