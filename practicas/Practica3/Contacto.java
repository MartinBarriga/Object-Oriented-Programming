public class Contacto{
	private String Nombre, Telefono, Correo;
	private Agenda agenda = new Agenda();
	public Contacto(){
		Nombre = "";
		Telefono = "";
		Correo = "";
	}
	public Contacto(String Nombre, String Telefono, String Correo){
		this.Nombre = Nombre;
		this.Telefono = Telefono;
		this.Correo = Correo;
	}

	public String getNombre(){
		return Nombre;
	}
	public String getTelefono(){
		return Telefono;
	}
	public String getCorreo(){
		return Correo;
	}
	public void setNombre(String Nombre){
		this.Nombre = Nombre;
	}
	public void setTelefono(String Telefono){
		this.Telefono = Telefono;
	}
	public void setCorreo(String Correo){
		this.Correo = Correo;
	}
	public void registrarAgenda(Agenda agenda){
		this.agenda = agenda;
	}
	public Agenda getAgenda(){
		return agenda;
	}
}