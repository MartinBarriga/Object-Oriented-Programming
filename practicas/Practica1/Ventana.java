import javax.swing.JOptionPane;

public class Ventana {
	private String idUsuario;
	private int opcion;
	private Double deposito,retiro;
	public String seleccionarUsuario(){
		idUsuario = JOptionPane.showInputDialog(null, "Ingresa el Identificador de Usuario\nPara salir introduce -> Salir" ,"seleccionarUsuario", JOptionPane.QUESTION_MESSAGE);
		return idUsuario;
	}
	public String mostrarOpciones(Cliente cliente){
	  	return JOptionPane.showInputDialog(null, "Hola, " + cliente.getNombre() + "!\nCon Id: " + cliente.getID() + "\n\nTe invitamos a seleccionar una de las siguientes opciones:\n\n1.-Ver Saldo\n\n2.-Depositar\n\n3.-Retirar\n\n4.-Salir", "SeleccionaOpcion", JOptionPane.QUESTION_MESSAGE);
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
	public void depositarSaldo(Cliente cliente){
		while(true){
			deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad que quieres depositar", "Depositar Saldo", JOptionPane.QUESTION_MESSAGE));
			if(deposito <=0) JOptionPane.showMessageDialog(null, "No puedes depositar cantidades menores o iguales a cero ", "Mensaje Error Retiro", JOptionPane.ERROR_MESSAGE);

			else {
				cliente.depositar(deposito);
				JOptionPane.showMessageDialog(null, "Has depositado exitosamente!", "Deposito exitoso", JOptionPane.INFORMATION_MESSAGE);
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
				break;
			}
			else{
				if(cliente.getMonto() - (retiro + 30.5) >= 0){
					cliente.retirar(retiro + 30.5);
					JOptionPane.showMessageDialog(null, "Has retirado exitosamente!", "Retiro exitoso", JOptionPane.INFORMATION_MESSAGE);
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

