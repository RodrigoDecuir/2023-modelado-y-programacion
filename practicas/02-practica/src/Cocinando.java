/**
 *
 * @author tukuwanaminaku
 */
public class Cocinando implements EstadoRobot {

    /** */
    Robot robot;

    /** */
    public Cocinando (Robot robot){
		this.robot = robot;
	}

    /** */
	public void suspender() {
		System.out.println("El robot no puede ser suspendido mientras esta atendiendo.");
	}

    /** */
	public void activar() {
		System.out.println("El robot esta activo.");
	}

    /** */
	public void caminar() {
		System.out.println("El robot esta en la mesa del cliente.");
	}

    /** */
	public void atender() {
		System.out.println("El robot debe de terminar de cocinar anter de tomar la siguiente orden.");
	}

    /** */
	public void cocinar() {
		System.out.println("El robot esta cocinando.");

        robot.pedido.prepareHamburguer();

        robot.setNuevoEstado(robot.getEstadoAtendiendo());
	}

}
