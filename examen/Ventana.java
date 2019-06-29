import javax.swing.JOptionPane;

public class Ventana {
	private String idUsuario;
	private int opcion,indice;
	private Double deposito,retiro,transferencia;
	public String seleccionarUsuario(){
		idUsuario = JOptionPane.showInputDialog(null, "Ingresa el Identificador de Usuario\nPara salir introduce -> Salir" ,"seleccionarUsuario", JOptionPane.QUESTION_MESSAGE);
		return idUsuario;
	}
	public String mostrarOpciones(Cliente cliente){
	  	return JOptionPane.showInputDialog(null, "Hola, " + cliente.getNombre() + "!\nCon Id: " + cliente.getID() + "\n\nTe invitamos a seleccionar una de las siguientes opciones:\n\n1.-Ver Saldo\n\n2.-Depositar\n\n3.-Retirar\n\n4.-Transferencia entre cuentas\n\n5.-Historial Movimientos\n\n6.-Salir", "SeleccionaOpcion", JOptionPane.QUESTION_MESSAGE);
	}
	public void mostrarErrorID(){
		JOptionPane.showMessageDialog(null, "No se encontro a ningun cliente con el Id ingresado", "Mensaje Error ID", JOptionPane.ERROR_MESSAGE);
	}
	public void mostrarErrorOpcion(){
		JOptionPane.showMessageDialog(null, "La opcion que ingreso no se encuentra disponible", "Mensaje Error Opcion", JOptionPane.ERROR_MESSAGE);
	}
	public void mostrarSaldo(Cliente cliente){
		JOptionPane.showMessageDialog(null, "Tu saldo es de $" + cliente.getMonto(), "Mostrar Saldo", JOptionPane.INFORMATION_MESSAGE);
	}
	public void verHistorial(Cliente cliente){
		JOptionPane.showMessageDialog(null, cliente.getHistorial(), "Movimientos", JOptionPane.INFORMATION_MESSAGE);

	}
	public void transferirSaldo(Cliente cliente, Cliente[] listaCliente){
		while(true)
		{
			transferencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad a transferir", "Transferir", JOptionPane.QUESTION_MESSAGE));
			if(transferencia <=0)
				JOptionPane.showMessageDialog(null, "No puedes transferir cantidades menores o iguales a cero", "Mensaje Error Retiro", JOptionPane.ERROR_MESSAGE);

			else if((cliente.getMonto() - transferencia) >= 1000){
				 	indice= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el indice del usuario al que quieres transferir\n 0.- Jose Manuel Ramirez Vives \n 1.- Martin Eduardo Barriga Vargas \n2.-Jaime Alejandro Salinas Nuñez\n 3.-Joselito Sanchez\n 4.-Gustavito gutierrez" , "Transferir", JOptionPane.QUESTION_MESSAGE));
					if(indice < 0 || indice > 4)
						JOptionPane.showMessageDialog(null, "Error! No existe un usuario con ese indice", "Mensaje Error Retiro", JOptionPane.ERROR_MESSAGE);
					else {
						cliente.retirar(transferencia);
						 listaCliente[indice].depositar(transferencia);
	 			  	JOptionPane.showMessageDialog(null, "Tranferencia hecha exitosamente!", "transferencia exitoso", JOptionPane.INFORMATION_MESSAGE);
	 			  	cliente.addHistorial(listaCliente[indice].getNombre(),"transferencia",transferencia);
	 			  	listaCliente[indice].addHistorial(cliente.getNombre(),"Deposito de ",transferencia);
						break;
					}

	 		}

	 		else{
	 			if(cliente.getMonto() - (transferencia + 30.5) >= 0){
					indice= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el indice del usuario al que quieres transferir\n 0.- José Manuel Ramirez Vives \n 1.- Martin Eduardo Barriga Vargas \n2.-Jaime Alejandro Salinas Nuñez\n 3.-Joselito Sanchez\n 4.-Gustavito gutierrez" , "Transferir", JOptionPane.QUESTION_MESSAGE));
					if(indice < 0 || indice > 4)
						JOptionPane.showMessageDialog(null, "Error! No existe un usuario con ese indice", "Mensaje Error Retiro", JOptionPane.ERROR_MESSAGE);
					else {
						cliente.retirar(transferencia+30.5);
						listaCliente[indice].depositar(transferencia);
	 			  	JOptionPane.showMessageDialog(null, "transferencia hecho exitosamente!", "transferencia exitoso", JOptionPane.INFORMATION_MESSAGE);
	 			  		cliente.addHistorial(listaCliente[indice].getNombre(),"transferencia",transferencia);
	 			  		listaCliente[indice].addHistorial(cliente.getNombre(),"Deposito de ",transferencia);
						break;
					}
				}
	 			else {
	 				JOptionPane.showMessageDialog(null, "No puedes retirar ", "Mensaje Error Retiro", JOptionPane.ERROR_MESSAGE);
	 			}

		}
	}
}

	public void depositarSaldo(Cliente cliente){
		while(true){
			deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad que quieres depositar", "Depositar Saldo", JOptionPane.QUESTION_MESSAGE));
			if(deposito <=0) JOptionPane.showMessageDialog(null, "No puedes depositar cantidades menores o iguales a cero ", "Mensaje Error Retiro", JOptionPane.ERROR_MESSAGE);

			else {
				cliente.depositar(deposito);
				JOptionPane.showMessageDialog(null, "Has depositado exitosamente!", "Deposito exitoso", JOptionPane.INFORMATION_MESSAGE);
				cliente.addHistorial("","deposito",deposito);
				break;
			}
		}
	}
	public void retirarSaldo(Cliente cliente){
		while(true) {
			retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad que quieres retirar", "Retirar Dinero", JOptionPane.QUESTION_MESSAGE));
			if(retiro <=0) 					
				JOptionPane.showMessageDialog(null, "No puedes retirar cantidades menores o iguales a cero", "Mensaje Error Retiro", JOptionPane.ERROR_MESSAGE);

			else if((cliente.getMonto() - retiro) >= 1000){
				cliente.retirar(retiro);
				JOptionPane.showMessageDialog(null, "Has retirado exitosamente!", "Retiro exitoso", JOptionPane.INFORMATION_MESSAGE);
					cliente.addHistorial("","retiro",retiro);
				break;
			}
			else{
				if(cliente.getMonto() - (retiro + 30.5) >= 0){
					cliente.retirar(retiro + 30.5);
					JOptionPane.showMessageDialog(null, "Has retirado exitosamente!", "Retiro exitoso", JOptionPane.INFORMATION_MESSAGE);
					cliente.addHistorial("","retiro",retiro);
					break;
				}
				else {
					JOptionPane.showMessageDialog(null, "No puedes retirar ", "Mensaje Error Retiro", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
	public void despedirCliente(Cliente cliente){
		JOptionPane.showMessageDialog(null, cliente.getNombre() + " ha cerrado sesion", "Mensaje Error ID", JOptionPane.INFORMATION_MESSAGE);
	}

}

