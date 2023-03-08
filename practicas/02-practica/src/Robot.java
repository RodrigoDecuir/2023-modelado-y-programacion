import java.util.Scanner;

/**
 * Clase contexto de State.
 */
public class Robot {
	
    private EstadoRobot suspendido;
    private EstadoRobot activo;
    private EstadoRobot caminando;
    private EstadoRobot atendiendo;
    private EstadoRobot cocinando; 
    private EstadoRobot estadoActual;    

    public Robot() {
        suspendido = new Suspendido(this); 
        activo = new Activo(this); 
        caminando = new Caminando(this);
        atendiendo = new LeyendoMenu(this);
        cocinando = new TomandoOrden(this);
        estadoActual = new estadoActual(this); 
    }

    public void activar () {
        this.activar();
    }
	
    public void setNuevoEstado(EstadoRobot nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    public EstadoRobot getEstadoSuspendido() {
        return suspendido;
    }

    public EstadoRobot getEstadoActivo() {
        return activo;
    }

    public EstadoRobot getEstadoCaminando() {
        return caminando;
    }

    public EstadoRobot getEstadoAtendiendo() {
        return atendiendo;
    }

    public EstadoRobot getEstadoCocinando() {
        return cocinando;
    }

    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }
   
}