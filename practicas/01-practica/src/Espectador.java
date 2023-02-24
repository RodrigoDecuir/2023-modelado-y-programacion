import java.io*;

/**
 * Clase para representar al espectador del combate. 
 * @author tukuwanaminaku
 */
public class Espectador() {
    private String id_Espectador;
    private String apuesta;
    private Escenario castilloDePeach ;

    public Espectador(String id_Espectador, String apuesta, Escenario castilloDePeach) {
        this.id_Espectador = id_Espectador;
        this.apuesta = apuesta;
        this.castilloDePeach = castilloDePeach;
    }
    /**
     *
     */
    @Override
    public void actualizar() {
     
    }

    public String getId_Espectador() {
        return id_Espectador; 
    }

    public String getApuesta() {
        return apuesta; 
    }
}
