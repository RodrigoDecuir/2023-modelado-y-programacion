import java.util.Scanner;

public class Atendiendo implements EstadoRobot {

    Robot robot;
	Scanner scan = new Scanner(System.in);
	int id;

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

		System.out.println("\n !~~~~~ Menu del dia ~~~~~! ");
		robot.muestraMenuDelDia();
		System.out.println("\n !~~~~~ Menu General ~~~~~! ");
		robot.muestraMenuGeneral();
		System.out.println("\n !~~~~ Menu Especial ~~~~! ");
		// robot.muestraMenuEspecial();

		System.out.print("Ingresa el ID de la opcion que deseas: ");
		id = scan.nextInt();
		System.out.println("Opcion elegida: " + id);

		if (robot.validaID(id)) {
			robot.IdPedido = id;
			robot.pedido = robot.buscaHamburguesa(id);
			robot.setNuevoEstado(robot.getEstadoCocinando());
		} else {
			System.out.println("\n ! Opcion no valida ...");
		}
        
	}

	public void cocinar() {
		System.out.println("El robot debe recibir una orden del Menu para poder cocinar.");
	}

}