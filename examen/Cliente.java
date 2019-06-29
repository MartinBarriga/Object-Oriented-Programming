public class Cliente{

	private String id, nombre, direccion;
	private Double monto;
	private String his = "Ultimas Operaciones:";

	public Cliente(){
		nombre = "Jose Manuel Ramirez Vives";
		id = "01";
		direccion = "Av. Rio Balsas #17 A, primer sector fideicomiso";
		monto = 1500.0;
	}
	public Cliente(String nuevoNombre, String nuevoId, String nuevaDir, Double nuevoMonto){
		nombre = nuevoNombre;
		id = nuevoId;
		direccion = nuevaDir;
		monto = nuevoMonto;
	}


	public String getNombre(){
		return nombre;
	}

	public String getID(){
		return id;
	}

	public String getDireccion(){
		return direccion;
	}
	public Double getMonto(){
		return monto;
	}

	public void depositar(Double depositoMonto){
		monto += depositoMonto;
	}
	public void retirar(Double retiroMonto){
		monto -= retiroMonto;
	}

	public void addHistorial(String nombre,String accion,Double monto){
	his+="\n";
	his+=accion;
	his+="  ";
	his+=nombre;
	his+=" Por un monto de: ";
	his+= monto;

	}
	public String getHistorial(){

		return his;

	}

}