public class Practica{

	public static void main(String[] args) {
		String idRecibido,opcion;
		final int tam = 3;
	    int i, indiceCliente = -1;
		Cliente[] cliente = new Cliente[tam];
		Ventana ventana;
		ventana = new Ventana();
		cliente[0] = new Cliente();
		cliente[1] = new Cliente("Martin Eduardo Barriga Vargas", "02", "Quito #781 LindaVista Norte", 1908.0);
		cliente[2] = new Cliente("Jaime Alejandro Salinas Nuñez", "0kska3", "Calle del diablo joz joz", 2301.0);
		while(true){
			idRecibido = ventana.seleccionarUsuario();
			if(idRecibido == null) break;
			for(i = 0; i < tam; i++){

				if(idRecibido.equals(cliente[i].getID())){
					indiceCliente = i;
					break;
				}
			}
			if(indiceCliente != -1) {
				while(true){
					opcion = ventana.mostrarOpciones(cliente[indiceCliente]);
					if(opcion == null) break;
					if(opcion.equals("1")){
						ventana.mostrarSaldo(cliente[indiceCliente]);
					}
					else if(opcion.equals("2")){
						ventana.depositarSaldo(cliente[indiceCliente]);
					}
					else if(opcion.equals("3")){
						ventana.retirarSaldo(cliente[indiceCliente]);
					}
					else if(opcion.equals("4")){
						ventana.despedirCliente(cliente[indiceCliente]);
						indiceCliente = -1;
						break;
					}
					else {
						ventana.mostrarErrorOpcion();
					}
				}
			}
			else if(idRecibido.equals("Salir")){
				break;
			}
			else{
				ventana.mostrarErrorID();
			}
		}
	}
}