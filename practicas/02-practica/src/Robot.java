import java.util.Scanner;

/**
 * Clase contexto de State.
 */
public class Robot {
	
	private EstadoRobot suspendido;
	private EstadoRobot activo;
	private EstadoRobot caminando;
	private EstadoRobot leyendoMenu;
    private EstadoRobot tomandoOrden; 
    private EstadoRobot preparandoOrden;
    private EstadoRobot entregandoOrden;

    private EstadoRobot estadoActual;    

	public Robot() {
        suspendido = new Suspendido(this); 
        activo = new Activo(this); 
        caminando = new Caminando(this);
        leyendoMenu = new LeyendoMenu(this);
        tomandoOrden = new TomandoOrden(this);
        preparandoOrden = new PreparandoOrden(this); 
        entregandoOrden = new EntregandoOrden(this);
    }
	
    public void asignarNuevoEstado(EstadoRobot nuevoEstado) {
        estadoActual = nuevoEstado;
    }
   
    public void activar() {
        estadoActual.activar(); 
    }

    public void caminar() {
        estadoActual.caminar();
    }

    public void mostrarMenu() {
        estadoActual.mostrarMenu();
    }

    public void tomarOrden() {
		System.out.println("Recibiendo comanda... ");
			
		System.out.println("ComandaRecibida.");	
	
        estadoActual.tomarOrden();
    }

    public void prepararOrden() {
        estadoActual.prepararOrden();
    }

    public void entregarOrden() {
        estadoActual.entregarOrden();
    }

    public void suspender() {
        estadoActual.suspender();
    }

	public EstadoRobot getEstadoSuspendido(){
		return suspendido;
	}
    
    public EstadoRobot getEstadoActivo() {
        return activo;

	public EstadoRobot getEstadoCaminando() {
		return caminando;
	}

	public EstadoRobot getEstadoLeyendoMenu() {
		return leyendoMenu;
	}

	public EstadoRobot getEstadoTomandoOrden() {
		return tomandoOrden;
	}

	public EstadoRobot getEstadoPreparandoOrden() {
		return preparandoOrden;
	}
    
    public EstadoRobot getEstadoEntregandoOrden() {
        return entregandoOrden;
    } 
}
