public class Atendiendo implements EstadoRobot {

    Robot robot;

    public Atendiendo (Robot robot){
		this.robot = robot;
	}

	public void suspender() {
		System.out.println("El robot no puede ser suspendido mientras esta atendiendo.");
	}

	public void activar() {
		System.out.println("El robot esta activo.");
	}

	public void caminar() {
		System.out.println("El robot esta en la mesa del cliente.");
	}

	public void atender() {
		System.out.println("El robot ha llegado a la mesa del cliente.");
        // aqui debe de tomar la orden

		robot.muestraMenuDelDia();
		
        robot.setNuevoEstado(robot.getEstadoCocinando());
	}

	public void cocinar() {
		System.out.println("El robot debe recibir una orden del Menu para poder cocinar.");
	}

}