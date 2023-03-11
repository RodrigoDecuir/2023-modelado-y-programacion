import java.util.Scanner;

/**
 * Clase contexto de State.
 * 
 * @author tukuwanaminaku
 */
public class Robot implements EstadoRobot {
	
    private EstadoRobot suspendido;
    private EstadoRobot activo;
    private EstadoRobot caminando;
    private EstadoRobot atendiendo;
    private EstadoRobot cocinando; 
    private EstadoRobot estadoActual;    
    private MenuDelDia menuDelDia = new MenuDelDia();
    private MenuGeneral menuGeneral = new MenuGeneral();

    /** */
    public Robot() {
        suspendido = new Suspendido(this); 
        activo = new Activo(this); 
        caminando = new Caminando(this);
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        estadoActual = suspendido;
    }

    /** */
    public void suspender () {
        estadoActual.suspender();
    }

    /** */
    public void activar () {
        estadoActual.activar();
    }

    /** */
    public void caminar () {
        estadoActual.caminar();
    }

    /** */
    public void atender() {
        estadoActual.atender();
    }

    /** */
    public void cocinar() {
        estadoActual.cocinar();
    }

    /** */
    public void setNuevoEstado(EstadoRobot nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /** */ 
    public EstadoRobot getEstadoSuspendido() {
        return suspendido;
    }

    /** */
    public EstadoRobot getEstadoActivo() {
        return activo;
    }

    /** */ 
    public EstadoRobot getEstadoCaminando() {
        return caminando;
    }

    /** */ 
    public EstadoRobot getEstadoAtendiendo() {
        return atendiendo;
    }

    /** */
    public EstadoRobot getEstadoCocinando() {
        return cocinando;
    }

    /** */
    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }
   
    public void muestraMenuDelDia() {
        menuDelDia.muestraHamburguesas();
    }

    public void muestraMenuGeneral() {
        menuGeneral.muestraHamburguesas();
    }

}
