/**
 * Interfaz de los estados del robot.
 */
public interface EstadoRobot { 

    public void suspender();
    public void activar();
    public void caminar();
    public void atender();
    public void cocinar();

}
