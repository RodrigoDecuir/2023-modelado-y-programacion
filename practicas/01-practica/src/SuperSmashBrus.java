/**
 * Simulacion de un combate entre tres personajes
 * implementando patrones Strategy y Observer.
 * @author tukuwanaminaku
 */
public class SuperSmashBrus {   
    public static void main(String[] args) { 
        Escenario castilloDePeach = new Escenario();
         
        /* Objeto de contexto. */
        //private DittuAtaque dittuu;
        //private KorbyAtaque korby;
        //private MeganManAtaque meganMan;

    //    System.out.println("***BIENVENIDO AL CASTILLO DE PEACH***"); 
/*        
        Math.random... 
        if(ran = 1) {
            caso1
        } else if(ran = 2) {
            caso2
        } else if(ran = 3) {
            caso3
        } else {
            System.out.println("Cargando escenario...");
        }
*/
        castilloDePeach.setMovimiento("Test");
        castilloDePeach.notificar();

        System.out.print("\n"); 
        Espectador murdocca = new Espectador("murdocca", "Kirby", castilloDePeach); 
        Espectador harary = new Espectador("harary", "Kirby", castilloDePeach); 
        Espectador carmen = new Espectador("carmen", "Dittuu", castilloDePeach); 
        Espectador chartrand = new Espectador("chartrand", "MeganMan", castilloDePeach); 
        
        castilloDePeach.setMovimiento("adios mundo");
        System.out.print("\n");
        castilloDePeach.notificar();

        carmen.sacarDelEscenario();

        castilloDePeach.setMovimiento("hola mundo");
        System.out.print("\n");
        castilloDePeach.notificar();
        
        //carmen = new Espectador("carmen", "MeganMan", castilloDePeach);
        
        castilloDePeach.setMovimiento("MeganMan mato a Kirby");
        System.out.print("\n");
        castilloDePeach.notificar();

    }
} 
    
