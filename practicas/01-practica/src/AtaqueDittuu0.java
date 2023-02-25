/**
 * Clase para implementar el ataque por defecto de Dittuu.
 * @author tukuwanaminaku
 */
public class AtaqueDittuu0 implements DittuuAtaque {

    /* Tipo de ataque */
    private String tipoAtaque; 

    /**
     * Metodo constructor.
     * @param tipoAtaque tipo del ataque
     * @param puntosAtaque puntos por ataque
     */ 
    public AtaqueDittuu0(String tipoAtaque, int puntosAtaque) {
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
    }
    
    /**
     * Metodo para atacar al enemigo.
     * @param Enemigo el personaje contra el cual se pelea 
     */
    public void atacar(Personaje enemigo) {

    }

    /**
     * Metodo para defenderse del enemigo.
     */
    public int defender() {

    }
}
