/**
 * Clase para implementar un ataque de MeganMan.
 * @author tukuwanaminaku.
 */
public class AtaqueMeganMan0 implements MeganManAtaque {
    
    /* Tipo de ataque */ 
    private String tipoAtaque; 
           
    /**
     * Metodo constructor.
     * @param tipoAtaque es el tipo de ataque.
     * @param puntosAtaque son los puntos por ataque.
     */
    public AtaqueMeganMan0(String tipoAtaque, int puntosAtaque) {
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
    }

    /**
     * Metodo para atacar al contrincante.
     */
    public void atacar(Personaje Enemigo) {
        
    }
   
    /**
     * Metodo para defenderse de un ataque.
     */ 
    public int defender() {

    }
}
