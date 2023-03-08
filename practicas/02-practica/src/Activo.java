public class Activo implements EstadoRobot {

    Robot robot;

    public Activo (Robot robot){
		this.robot = robot;
	}

	public void suspender() {
		System.out.println("El robot ha sido suspendido.");
		robot.setNuevoEstado(robot.getEstadoSuspendido());
	}

	public void activar() {
		System.out.println("El robot esta activo.");
	}

	public void caminar() {
		System.out.println("El robot ha sido llamado a la mesa de un cliente.");
		robot.setNuevoEstado(robot.getEstadoCaminando());
	}

	public void atender() {
		System.out.println("El robot debe de llegar con un cliente para poder atenderlo.");
	}

	public void cocinar() {
		System.out.println("El robot debe recibir una orden del Menu para poder cocinar.");
	}

}