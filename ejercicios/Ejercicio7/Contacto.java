
public class Contacto{

	String telefono, nombre, correo;

	public Contacto(){
		nombre = "Saul";
		telefono = "5590212731";
		correo = "saul@gmail.com";
	}

	public Contacto(String nuevoNombre, String nuevoTelefono, String nuevoCorreo){
		nombre = nuevoNombre;
		telefono = nuevoTelefono;
		correo = nuevoCorreo;
	}
	public Contacto(Contacto nuevoContacto)
	{
		nombre = nuevoContacto.nombre;
		telefono = nuevoContacto.telefono;
		correo = nuevoContacto.correo;
	}

	public String getNombre(){
		return nombre;
	}

	public String getTelefono(){
		return telefono;
	}

	public String getCorreo(){
		return correo;
	}

	public void setNombre(String nuevoNombre){
		nombre = nuevoNombre;
	}
	public void setTelefono(String nuevoTelefono){
		telefono = nuevoTelefono;
	}
	public void setCorreo(String nuevoCorreo){
		correo = nuevoCorreo;
	}
}