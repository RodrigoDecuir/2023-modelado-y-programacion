/**
 * Clase para implementar uno de los ataques de Dittuu.
 * @author tukuwanaminaku
 */ 
public class AtaqueDittuu3 implements DittuuAtaque {
    
    /* Tipo de ataque */ 
    private String tipoAtaque; 
               
    /**
     * Metodo constructor.
     * @param tipoAtaque tipo de ataque 
     * @param puntosAtaque puntos por ataque 
     */
    public AtaqueDittuu3(String tipoAtaque, int puntosAtaque) {
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
