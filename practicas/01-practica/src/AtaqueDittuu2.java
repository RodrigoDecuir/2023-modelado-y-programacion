/**
 * Clase para implementar un ataque de Dittuu.
 * @author tukuwanaminaku
 */
public class AtaqueDittuu2 implements DittuuAtaque {
    
    /* Tipo de ataque */    
    private String tipoAtaque; 
    
    /**
     * Metodo constructor.
     * @param tipoAtaque tipo de ataque
     * @param puntosAtaque puntos por el ataque 
     */
    public AtaqueDittuu2(String tipoAtaque, int puntosAtaque) {
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
    }

    /**
     * Metodo para atacar al contrincante.
     * @param enemigo es el contrincante
     */
    public void atacar(Personaje enemigo) {

	}
   
    /**
     * Metodo para defenderse de un ataque.
     */ 
    public int defender() {

    } 
}
