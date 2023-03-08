public class Suspendido implements EstadoRobot {

	Robot robot;

	public Suspendido (Robot robot){
		this.robot = robot;
	}

	public void suspender() {
		System.out.println("El robot esta suspendido.");
	}

	public void activar() {
		System.out.println("El robot ha sido activado por un cliente.");
		robot.setNuevoEstado(robot.getEstadoActivo());
	}

	public void caminar() {
		System.out.println("El robot debe ser activado para caminar.");
	}

	public void atender() {
		System.out.println("El robot debe de llegar con un cliente para poder atenderlo.");
	}

	public void cocinar() {
		System.out.println("El robot debe recibir una orden del Menu para poder cocinar.");
	}

}

