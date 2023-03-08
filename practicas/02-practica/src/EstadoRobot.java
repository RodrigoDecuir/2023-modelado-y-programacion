/**
 * Interfaz de los estados del robot.
 */
public interface EstadoRobot { 

    public void suspendido();
    public void activo();
    public void caminando();
    public void atendiendo();
    public void cocinando();

}