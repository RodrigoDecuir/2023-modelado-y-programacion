/**
 * Interfaz de los estados del robot.
 * 
 * @author tukuwanaminaku
 */
public interface EstadoRobot { 

    /** Metodo para suspender al robot. */
    public void suspender();
    /** Metodo para activar al robot. */
    public void activar();
    /** Metodo para hacer que el robot camine. */
    public void caminar();
    /** Metodo para hacer que el robot atienda. */
    public void atender();
    /** Metodo para hacer que el robot cocine. */
    public void cocinar();

}
