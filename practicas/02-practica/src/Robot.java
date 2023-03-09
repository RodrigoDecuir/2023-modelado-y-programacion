import java.util.Scanner;

/**
 * Clase contexto de State.
 */
public class Robot implements EstadoRobot{
	
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
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        estadoActual = suspendido; 
    }

    public void suspender () {
        this.suspender();
    }

    public void activar () {
        this.activar();
    }
    public void caminar () {
        this.caminar();
    }

    public void atender() {
        this.atender();
    }

    public void cocinar() {
        this.cocinar();
    }

    public void setNuevoEstado(EstadoRobot nuevoEstado) {
        this.estadoActual = nuevoEstado;
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
