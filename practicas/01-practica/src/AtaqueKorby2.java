/**
 * Clase para implementar un ataque de Korby.
 * @author tukuwanaminaku
 */
public class AtaqueKorby2 implements KorbyAtaque {
    
    /* Tipo de ataque */ 
    private String tipoAtaque; 
           
    /**
     * Metodo constructor.
     * @param tipoAtaque es el tipo de ataque
     * @param puntosAtaque son los puntos por ataque
     */ 
    public AtaqueKorby2(String tipoAtaque, int puntosAtaque) {
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
    }
    
    /**
     * Metodo para atacar al contrincante.
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
