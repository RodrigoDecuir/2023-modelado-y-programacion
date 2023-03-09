import java.util.Scanner;

/**
 * Clase para ejecutar el programa.
 */
public class McBurguesas {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Menu menu = new Menu("MenuGeneral");     

        Scanner sc = new Scanner(System.in);
        int opcion;
		
        System.out.println("***BIENVENIDO A EL RESTAURANTE MCBURGUESAS.***");
                        //+ "\nEstado actual del robot: " + estado + 
                         // "\nAcciones disponibles"
                        //+ "\nPor favor elige la opcion que deseas ejecutar.");
        do {

            System.out.println(
                "1.- Suspender.\n" +
                "2.- Activar.\n" + 
                "3.- Caminar.\n" + 
                "4.- Atender.\n" +
                "5.- Cocinar.\n" +
                "6.- Terminar simulacion.\n");

            while(true) {
                try {
                    String opcionUsuario = sc.nextLine();
                        opcion = Integer.parseInt(opcionUsuario);
                        break;
                } catch (NumberFormatException ex) {
                    System.out.println("Por favor elige la opcion VALIDA "
                        + "que deseas ejecutar.\n" + 
                        "1.- Suspender.\n" +
                        "2.- Activar.\n" + 
                        "3.- Caminar.\n" + 
                        "4.- Atender.\n" +
                        "5.- Cocinar.\n" +
                        "6.- Terminar simulacion.\n");
                }
            }

            switch(opcion) {
                case 1:
                    robot.suspender();
                    break;

                case 2:
                    robot.activar();
                    break;

                case 3:
                    robot.caminar();
                    break;

                case 4:
                    robot.atender();
                    break;

                case 5:
                    robot.cocinar();
                    break;

                default:
                    System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
                    break;
            }

        } while (opcion != 6);
        System.out.println("Regresa pronto");
    }
}
