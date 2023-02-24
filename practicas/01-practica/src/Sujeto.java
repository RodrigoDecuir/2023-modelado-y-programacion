/**
 * Interfaz que contiene la infraestructura de suscripcion.
 * @author tukuwanaminaku
 */

public interface Sujeto() {
    public void registrar(Observador b);
    public void remover(Observador b);
    public void notificar();
}
