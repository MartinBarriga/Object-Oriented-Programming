import java.util.List;
import java.util.ArrayList;
public class item{

 String mio;
 int pago;
 int monto;
 int lista;

	public  item(producto p,int cant, int num){

		mio = p.getproducto();
		pago = p.getprecio(); 
		monto = cant;
		lista = num;
		p.tomar(cant);

	}

	public void devolucion(List<producto> pro){

			(pro.get(lista)).stock += monto;

	}

	public void agregar(List<producto> pro,int mas){
		monto += mas;
		(pro.get(lista)).tomar(mas);
	}



}