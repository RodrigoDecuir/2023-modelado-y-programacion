/**
 * Clase para implementar un ataque de MeganMan
 * @author tukuwanaminaku
 */
public class AtaqueMeganMan1 implements MeganManAtaque {
    
    /* tipo de ataque */ 
    private String tipoAtaque; 
           
    /**
     * Metodo constructor.
     * @param tipoAtaque es el tipo de ataque
     * @param puntosAtque son los puntos por ataque 
     */
    public AtaqueMeganMan1(String tipoAtaque, int puntosAtaque) {
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
    }
    
    /**
     * Metodo para atacar a un contrincante.
     */
    public void atacar(Personaje Enemigo) {
        
    }
    
    /** 
     * Metodo para defenderse de un ataque.
     */ 
    public int defender() {
        
    }
}
