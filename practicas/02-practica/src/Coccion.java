/**
 * Clase para mostrar el proceso de coccion.
 */
public abstract class Coccion {
    
    /**metodo template*/
    final void prepararHamburguesa {
        ponerPan();
        ponerMayonesa();
        ponerMostaza();
        if(llevaCarne) {
            prepararCarne();
            ponerCarne();
        }
        if(llevaQueso()) {
            ponerQueso();
        }
        if(llevaVegetales()) {
            ponerVegetales();
        }
        ponerCatsup();
        ponerPan();
    }    
    
    public void ponerPanDeBase() {
        System.out.println("");
    }

    public void ponerMayonesa() {
        System.out.println("");
    }

    public void ponerMostaza() {
        System.out.println("");
    }

    abstract void prepararCarne();
    abstract void ponerCarne();
    abstract void ponerQueso();
    abstract void ponerVegetales();
    
    boolean llevaCarne() { return true; }
    boolean llevaQueso() { return true; }
    boolean llevaVegetales() { return true; }

    public void ponerCatsup() {
        System.out.println("");

    }

    public void ponerPanDeTapa() {
        System.out.println("");
    }
}
