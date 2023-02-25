/**
 * Clase para implementar un metodo de MeganMan 
 * @author tukuwanaminaku
 */
public class AtaqueMeganMan3 implements MeganManAtaque {
    
    /* Tipo de ataque */  
    private String tipoAtaque; 
           
    /**
     * Metodo constructor.
     * @param tipoAtaque es el tipo de ataque.
     * @param puntosAtaque son los puntos por ataque.
     */ 
    public AtaqueMeganMan3(String tipoAtaque, int puntosAtaque) {
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
    }
    
    /**
     * Metodo para atacar a un contrincante.
     * @param enemigo es el contrincante.
     */
    public void atacar(Personaje enemigo) {
        
    }
   
    /**
     * Metodo para defenderse de un ataque.
     */ 
    public int defender() {

    }
}
