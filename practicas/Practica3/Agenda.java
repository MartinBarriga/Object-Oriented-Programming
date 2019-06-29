import java.util.*;
public class Agenda {
	private String nuevoNombre, nuevoTelefono, nuevoCorreo, arregloContactos, opcion, numeroContacto, nombre, telefono, correo,informacionContacto;
	private int numeroContactoInt;
	private Ventana ventana = new Ventana();
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();

	public void crearContactosIniciales(){
		Contacto contacto1 = new Contacto("jaime", "7539137443", "jimmy@gmail.com");
		Contacto contacto2 = new Contacto("luis", "7531203411", "luis@gmail.com");
		Contacto contacto3 = new Contacto("jose", "75300837652", "jose@outlook.com");
		Contacto contacto4 = new Contacto("alan", "75352128843", "alan@gmail.com");
		Contacto contacto5 = new Contacto("pablo", "75330027412", "pablitocalvito@hotmail.com");
		contacto1.registrarAgenda(this);
		contacto2.registrarAgenda(this);
		contacto3.registrarAgenda(this);
		contacto4.registrarAgenda(this);
		contacto5.registrarAgenda(this);
		contactos.add(contacto1);
		contactos.add(contacto2);
		contactos.add(contacto3);
		contactos.add(contacto4);
		contactos.add(contacto5);

	}
	public void crearContacto(){
		nuevoNombre = ventana.pedirNombre();
		nuevoTelefono = ventana.pedirTelefono();
		nuevoCorreo = ventana.pedirCorreo();
		Contacto contacto = new Contacto(nuevoNombre, nuevoTelefono, nuevoCorreo);
		contacto.registrarAgenda(this);
		contactos.add(contacto);
	}
	public void elegirContacto(){
		if(contactos.size() == 0) {
			ventana.mostrarMensajeNoHayContactos();
		}
		else{
			while(true){ //para ciclar la muestra de la lista de contactos
				arregloContactos = "";
				for(int i = 0; i < contactos.size(); i++){
					arregloContactos += i + " " + contactos.get(i).getNombre() + " " + contactos.get(i).getTelefono() + " " + contactos.get(i).getCorreo() + "\n";
				}
				numeroContacto = ventana.mostrarContactos(arregloContactos);
				if(numeroContacto == null) break; 
				else if(numeroContacto.length() == 0){
					ventana.mostrarMensajeNumeroIncorrecto();
				}
				else {
					int pasa = 1;
					for(int i = 0; i< numeroContacto.length(); i++) if( (numeroContacto.charAt(i) < '0') || (numeroContacto.charAt(i) > '9' ) ) pasa = 0;
					if(pasa == 1){
						numeroContactoInt = Integer.parseInt(numeroContacto);
						if((numeroContactoInt >= 0) && (numeroContactoInt < contactos.size())){
							//
							elegirOpcionContacto();
							if(contactos.isEmpty()) {
								ventana.mostrarMensajeNoHayContactos();	
								return;
							}

						}
						else{
							ventana.mostrarMensajeNumeroIncorrecto();
						}
					}
					pasa = 1;
				}
			}
		}
	}
	public void buscarContacto(){
		if(contactos.isEmpty()) {
			ventana.mostrarMensajeNoHayContactos();	
			return;
		}
		while(true){
			opcion = ventana.mostrarOpcionesBusqueda();
			if(opcion == null) return;
			if(opcion.equals("1")){
				nombre = ventana.pedirNombre();
				for(int i = 0; i < contactos.size(); i++){
					if(contactos.get(i).getNombre().equals(nombre))
					{
						informacionContacto = i + " " +  contactos.get(i).getNombre() + " " + contactos.get(i).getTelefono() + " " + contactos.get(i).getCorreo() + "\n";
						ventana.mostrarInformacionContacto(informacionContacto);
						break;
					}
					else if( i == (contactos.size()-1)) ventana.mostrarMensajeNoSeEncontroContacto();
				}
			}
			else if(opcion.equals("2")){
				telefono = ventana.pedirTelefono();
				for(int i = 0; i < contactos.size(); i++){
					if(contactos.get(i).getTelefono().equals(telefono))
					{
						informacionContacto = i + " "  + contactos.get(i).getNombre() + " " + contactos.get(i).getTelefono() + " " + contactos.get(i).getCorreo() + "\n";
						ventana.mostrarInformacionContacto(informacionContacto);
						break;
					}
					else if( i == (contactos.size()-1)) ventana.mostrarMensajeNoSeEncontroContacto();
				}
			}
			else if(opcion.equals("3")){
				correo = ventana.pedirCorreo();
				for(int i = 0; i < contactos.size(); i++){
					if(contactos.get(i).getCorreo().equals(correo))
					{
						informacionContacto = i + " " + contactos.get(i).getNombre() + " " + contactos.get(i).getTelefono() + " " + contactos.get(i).getCorreo() + "\n";
						ventana.mostrarInformacionContacto(informacionContacto);
						break;
					}
					else if( i == (contactos.size()-1)) ventana.mostrarMensajeNoSeEncontroContacto();
				}
			}
		}
	}
	public void borrarContacto(int numeroContactoInt){
		contactos.remove(numeroContactoInt);
	}
	public void elegirOpcionContacto(){
		while(true){
			opcion  = ventana.mostrarOpcionesDeContacto();
			if((opcion == null) || (opcion.equals("3"))) break;
			else if(opcion.equals("2")){
				contactos.get(numeroContactoInt).getAgenda().borrarContacto(numeroContactoInt);
				//contactos.remove(numeroContactoInt); 	
				break;
			}
			else if(opcion.equals("1")){
				while(true){
					opcion = ventana.mostrarOpcionesEdicion();
					if(opcion.equals("1")){
						nuevoNombre = ventana.pedirNombre();
						contactos.get(numeroContactoInt).setNombre(nuevoNombre);
						break;
					}
					else if(opcion.equals("2")){
						nuevoTelefono = ventana.pedirTelefono();
						contactos.get(numeroContactoInt).setTelefono(nuevoTelefono);
						break;
					}
					else if(opcion.equals("3")){
						nuevoCorreo = ventana.pedirCorreo();
						contactos.get(numeroContactoInt).setCorreo(nuevoCorreo);
						break;
					}
				}
			}
		}

	}
}