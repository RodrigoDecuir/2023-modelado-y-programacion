/**
 * Clase para implementar un ataque de MeganMan.
 * @author tukuwanaminaku
 */
public class AtaqueMeganMan2 implements MeganManAtaque {
    
    /* TipoAtaque */ 
    private String tipoAtaque; 
           
    /**
     * Metodo constructor.
     * @param tipoAtaque es el tipo de ataque.
     * @param puntosAtaque son los puntos por ataque.
     */ 
    public AtaqueMeganMan2(String tipoAtaque, int puntosAtaque) {
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
    }

    /**
     * Metodo para atacar a un enemigo.
     * @param enemigo es el enemigo
     */
    public void atacar(Personaje enemigo) {
        
    }
    
    /**
     * Metodo para defenderse de un ataque.
     */ 
    public int defender() {

    }
}
