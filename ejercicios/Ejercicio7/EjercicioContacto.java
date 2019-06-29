
import javax.swing.JOptionPane;

public class EjercicioContacto {
	public static void main(String[] args) {
		Contacto contacto1, contacto2, contacto3;
		String opcion1, opcion2, respuesta;
		contacto1 = new Contacto();
		contacto2 = new Contacto("Rony", "55829330134", "rony@gmail.com");
		contacto3 = new Contacto(contacto1);
		while(true)
		{
			opcion1 = JOptionPane.showInputDialog(null, "1. " + contacto1.getNombre() +" " + contacto1.getTelefono() + " " +contacto1.getCorreo() + "\n2. "+contacto2.getNombre() +" " + contacto2.getTelefono() + " " +contacto2.getCorreo()+"\n3. "+contacto3.getNombre() +" " + contacto3.getTelefono() + " " +contacto3.getCorreo()+ "\n4. Salir" , "Contacto", JOptionPane.QUESTION_MESSAGE);

			if(Integer.parseInt(opcion1) == 4) break;
			else{
				while(true)
				{
					opcion2 = JOptionPane.showInputDialog(null, "1. Nombre \n2. Telefono\n3. Correo\n4.Regresar " ,"Submenu", JOptionPane.QUESTION_MESSAGE);
					if(Integer.parseInt(opcion2) == 4) break;
					if(Integer.parseInt(opcion1) == 1)
					{
						if(Integer.parseInt(opcion2) == 1)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo nombre\n", "Nuevo Nombre", JOptionPane.QUESTION_MESSAGE);
							contacto1.setNombre(respuesta);	
						}
						if(Integer.parseInt(opcion2) == 2)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo telefono\n", "Nuevo Telefono", JOptionPane.QUESTION_MESSAGE);
							contacto1.setTelefono(respuesta);	
						}
						if(Integer.parseInt(opcion2) == 3)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo correo\n", "Nuevo Correo", JOptionPane.QUESTION_MESSAGE);
							contacto1.setCorreo(respuesta);	
						}
					}
					if(Integer.parseInt(opcion1) == 2)
					{
						if(Integer.parseInt(opcion2) == 1)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo nombre\n", "Nuevo Nombre", JOptionPane.QUESTION_MESSAGE);
							contacto2.setNombre(respuesta);	
						}
						if(Integer.parseInt(opcion2) == 2)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo telefono\n", "Nuevo Telefono", JOptionPane.QUESTION_MESSAGE);
							contacto2.setTelefono(respuesta);	
						}
						if(Integer.parseInt(opcion2) == 3)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo correo\n", "Nuevo Correo", JOptionPane.QUESTION_MESSAGE);
							contacto2.setCorreo(respuesta);	
						}
					}
					if(Integer.parseInt(opcion1) == 3)
					{
						if(Integer.parseInt(opcion2) == 1)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo nombre\n", "Nuevo Nombre", JOptionPane.QUESTION_MESSAGE);
							contacto3.setNombre(respuesta);	
						}
						if(Integer.parseInt(opcion2) == 2)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo telefono\n", "Nuevo Telefono", JOptionPane.QUESTION_MESSAGE);
							contacto3.setTelefono(respuesta);	
						}
						if(Integer.parseInt(opcion2) == 3)
						{
							respuesta = JOptionPane.showInputDialog(null, "Ingresa el nuevo correo\n", "Nuevo Correo", JOptionPane.QUESTION_MESSAGE);
							contacto3.setCorreo(respuesta);	
						}
					}

				}
			}
		}
	}
}