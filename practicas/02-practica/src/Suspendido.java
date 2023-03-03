public class Suspendido implements EstadoRobot {

	Robot robot;

	public Suspendido(Robot robot){
		this.robot = robot;
	}

	public void activar(){

		if(mecha.getUbicacionCorrecta() && mecha.getDemolicionAcabada() && mecha.getEscombrosLimpios()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR ha terminado su trabajo por hoy." +
				"Pasara a MODO APAGADO.");
			mecha.asignarNuevoEstado(mecha.getEstadoApagado());
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR ha sido activado.");
		}

	}

	public void caminar(){
		if(mecha.getUbicacionCorrecta() && mecha.getDemolicionAcabada() && mecha.getEscombrosLimpios()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR ha terminado su trabajo por hoy." +
				"Pasara a MODO APAGADO.");
			mecha.asignarNuevoEstado(mecha.getEstadoApagado());
		} else {
			if(mecha.getOrdenRecibida()){
				System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR pasara al MODO MOVIMIENTO.");
				mecha.asignarNuevoEstado(mecha.getEstadoCaminar());
			} else {
				System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR no ha recibido una orden. Pasara al MODO APAGADO.");
				mecha.asignarNuevoEstado(mecha.getEstadoApagado());
			}
		}
	}

	public void mostrarMenu(){
		if(mecha.getUbicacionCorrecta() && mecha.getDemolicionAcabada() && mecha.getEscombrosLimpios()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR ha terminado su trabajo por hoy." +
				"Pasara a MODO APAGADO.");
			mecha.asignarNuevoEstado(mecha.getEstadoApagado());
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR no puede demoler lejos del objetivo.");
		}
	}

	public void tomarOrden(){
		if(mecha.getUbicacionCorrecta() && mecha.getDemolicionAcabada() && mecha.getEscombrosLimpios()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR ha terminado su trabajo por hoy." +
				"Pasara a MODO APAGADO.");
			mecha.asignarNuevoEstado(mecha.getEstadoApagado());
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR no puede recolectar antes de demoler.");
		}
	}

	public void prepararOrden(){
		if(mecha.getUbicacionCorrecta() && mecha.getDemolicionAcabada() && mecha.getEscombrosLimpios()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR ha terminado su trabajo por hoy." +
				"Pasara a MODO APAGADO.");
			mecha.asignarNuevoEstado(mecha.getEstadoApagado());
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA DEMOLEDOR pasara al MODO APAGADO.");
			mecha.asignarNuevoEstado(mecha.getEstadoApagado());
		}
	}

	public void entregarOrden(){
	
	}

	public void suspender() {

	}
}

