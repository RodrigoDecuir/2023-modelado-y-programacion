/**
 *
 * @author tukuwanaminaku
 */
public class Caminando implements EstadoRobot {

    /** */
    Robot robot;

    /** */
    public Caminando (Robot robot){
		this.robot = robot;
	}

    /** */
	public void suspender() {
		System.out.println("El robot ha sido suspendido.");
		robot.setNuevoEstado(robot.getEstadoSuspendido());
	}

    /** */
	public void activar() {
		System.out.println("El robot esta activo.");
	}

    /** */
	public void caminar() {
		System.out.println("El robot esta en camino a la mesa del cliente.");
	}

    /** */
	public void atender() {
		System.out.println("El robot ha llegado a la mesa del cliente.");
        robot.setNuevoEstado(robot.getEstadoAtendiendo());
	}

    /** */
	public void cocinar() {
		System.out.println("El robot debe recibir una orden del Menu para poder cocinar.");
	}

}
