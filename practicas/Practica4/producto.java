import java.util.List;
import java.util.ArrayList;
public class producto{

  String producto;
private  int precio;
 int stock;


	public producto(String np,int pn,int ns){

		producto = np;
		precio = pn;
		stock = ns;

	}

	public String getproducto(){

		return producto;
	}

	public int getprecio(){

		return precio;
	}

	public int getstock(){

		return stock;
	}

	public void tomar(int robo){

		stock -= robo;
	}

}