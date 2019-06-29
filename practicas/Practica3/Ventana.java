import javax.swing.JOptionPane;
public class Ventana{
	//preguntar si está bien que no se pueda cancelar ni salir al ingresar nombre,correo y tel
	private String nombre, correo, telefono; 
	public String mostrarMenuPrincipal(){
		return JOptionPane.showInputDialog(null, "Ingresa una opcion:\n1.Elegir Contacto\n2.Crear Contacto\n3.Busqueda\n4.Salir\n" ,"Menu Principal", JOptionPane.QUESTION_MESSAGE);
	}	
	public String pedirNombre(){
		while(true){
			nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: \n" ,"Nuevo nombre", JOptionPane.QUESTION_MESSAGE);
			if((nombre != null) && (nombre.length() >0)) break;
		}
		return nombre;
	}
	public String pedirCorreo(){
		while(true){
			correo = JOptionPane.showInputDialog(null, "Ingresa el correo: \n" ,"Nuevo correo", JOptionPane.QUESTION_MESSAGE);
			if((correo != null) && (correo.length() >0)) break;
		}
		return correo;
	}
	public String pedirTelefono(){
		while(true){
			telefono = JOptionPane.showInputDialog(null, "Ingresa el telefono: \n" ,"Nuevo telefono", JOptionPane.QUESTION_MESSAGE);
			if((telefono != null) && (telefono.length() >0)) break;
		}
		return telefono;
	}

	public String mostrarContactos(String arregloContactos){
		return JOptionPane.showInputDialog(null, arregloContactos + "Elige un numero de contacto: \n","Contactos", JOptionPane.QUESTION_MESSAGE);
	}
	public void mostrarMensajeNoHayContactos(){
		JOptionPane.showMessageDialog(null, "No existe ningun contacto en tu agenda");
	}
	public String mostrarOpcionesDeContacto(){
		return JOptionPane.showInputDialog(null, "Elige una opcion: \n1. Editar\n2. Borrar\n3. Regresar\n", "Modificar contacto", JOptionPane.QUESTION_MESSAGE);
	}
	public void mostrarMensajeNumeroIncorrecto(){
		JOptionPane.showMessageDialog(null, "Ingresaste un numero de contacto inexistente");

	}
	public String mostrarOpcionesEdicion(){
		return JOptionPane.showInputDialog(null, "1. Editar nombre\n2. Editar telefono\n3. Editar correo\n", "Edicion",JOptionPane.QUESTION_MESSAGE);
	}
	public String mostrarOpcionesBusqueda(){
		return JOptionPane.showInputDialog(null, "1. Buscar por nombre\n2. Buscar por telefono\n3. Buscar por correo\n", "Busqueda",JOptionPane.QUESTION_MESSAGE);
	}
	public void mostrarInformacionContacto(String informacionContacto)
	{
		JOptionPane.showMessageDialog(null, informacionContacto);
	}
	public void mostrarMensajeNoSeEncontroContacto()
	{
		JOptionPane.showMessageDialog(null, "No se encontro el contacto!");
	}
}