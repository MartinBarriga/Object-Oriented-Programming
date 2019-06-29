public class Practica3 {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Ventana ventana = new Ventana();
		String opcion;
		agenda.crearContactosIniciales();
		while (true){
			opcion = ventana.mostrarMenuPrincipal();
			if(opcion == null) break;
			if(opcion.equals("1")){
				agenda.elegirContacto();
			}
			else if(opcion.equals("2")){
				agenda.crearContacto();
			}
			else if(opcion.equals("3")){
				agenda.buscarContacto();
			}
			else if(opcion.equals("4")){
				break;
			}
		}
	}
}