/**
 * Interfaz que contiene la infraestructura de suscripcion.
 * @author tukuwanaminaku
 */
public interface Sujeto {
    public void registrar(Espectador b);
    public void remover(Espectador b);
    public void notificar();
}
