import java.util.Scanner;

/**
 * Clase para ejecutar el programa.
 */
public class McBurguesas {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Menu menu = new Menu();     
        Coccion coccion = new Coccion();

        Scanner sc = new Scanner(System.in);
        int opcion;
		
        System.out.println("***BIENVENIDO A EL RESTAURANTE MCBURGUESAS.***");
                        + "\nEstado actual del robot" + estado + 
                        + "\nAcciones disponibles"
                        + "\nPor favor elige la opcion que deseas ejecutar.";
        do {
            System.out.println(
                "1.- Activar.\n" +
                "2.- Caminar.\n" + 
                "3.- Mostrar menu.\n" + 
                "4.- Tomar orden.\n" +
                "5.- Preparar orden.\n" +
                "6.- Entregar orden. \n"  + 
                "7.- Suspender. \n" +
                "0.- Terminar simulacion.\n");

            while(true) {
                try {
                    String opcionUsuario = sc.nextLine();
                        opcion = Integer.parseInt(opcionUsuario);
                        break;
                } catch(NumberFormatException ex) {
                    System.out.println("Por favor elige la opcion VALIDA "
                                + "que deseas ejecutar.\n" + 
                                "1.- Activar.\n" +
                                "2.- Caminar.\n" + 
                                "3.- Mostrar menu.\n" + 
                                "4.- Tomar orden.\n" +
                                "5.- Preparar orden. \n" +
                                "6.- Entregar orden.\n" +
                                "7.- Suspender.\n" +
                                "0.- Terminar simulacion.\n");
                    }
            }

            switch(opcion) {
                case 1:
                    robot.activar();
                    break;

                case 2:
                    robot.caminar();
                    break;

                case 3:
                    robot.mostrarMenu();
                    break;

                case 4:
                    robot.tomarOrden();
                    break;

                case 5:
                    robot.cocinar();
                    break;
                    
                case 6:
                    robot.entregarOrden();
                    break;

                case 7:
                    robot.suspender();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
                    break;
            }

        } while(opcion != 0);
        System.out.println("Regresa pronto");
    }
}
