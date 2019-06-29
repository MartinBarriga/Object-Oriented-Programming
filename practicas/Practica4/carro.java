import java.util.List;
import java.util.ArrayList;
public class carro{

 List<item> carro = new ArrayList<item>();

 public void agregarproducto(item a){

 	carro.add(a);

 }

 public int cargacarro(){

 	int a = carro.size();
 	return a;
 }


 public void vaciarcarro(){
 	carro.clear();

 }

 public item getitem(int pos){

 	item aux;
 	aux = carro.get(pos-1);
 	return aux;

 }

public void quitarproducto(int lugar){

	carro.remove(lugar-1);

}

public String contenido(){

	String carga ="";
	String pro [] = new String[carro.size()];
	String cuanto[] = new String[carro.size()];
		for (int i=0;i<carro.size() ;i++ ) {
			
			pro[i] = (carro.get(i)).mio;
			cuanto[i] =Integer.toString((carro.get(i)).monto);
			
		}
		for (int hx=0;hx<carro.size() ;hx++ ) {
			carga += Integer.toString(hx+1);
			carga += ".-  ";
			carga += pro[hx];
			carga += " Cantidad:  (";
			carga += cuanto[hx];
			carga += ")";
			carga += "\n";
		}

		return carga;
}


public String tikect(){

	int total = 0;
	String resultado ="";
	String nombres [] = new String[carro.size()];
	String cantidad[] = new String[carro.size()];
	String precio[] = new String[carro.size()];
		for (int j=0;j<carro.size() ;j++ ) {
			
			nombres[j] = (carro.get(j)).mio;
			cantidad[j] =Integer.toString((carro.get(j)).monto);
			precio[j] = Integer.toString((carro.get(j)).pago);
			total += ((carro.get(j)).pago*(carro.get(j)).monto);
			
		}
		for (int zx=0;zx<carro.size() ;zx++ ) {
			resultado += Integer.toString(zx+1);
			resultado += ".-  ";
			resultado += nombres[zx];
			resultado += " Cantidad: ";
			resultado += cantidad[zx];
			resultado += " Precio: ";
			resultado += precio[zx];
			resultado += "\n";
		}

		resultado += "\nEl total a pagar es:  ";
		resultado += Integer.toString(total);
		return resultado;
}

public String store(List<producto> inventario){
		String almacen ="";
		String nombres [] = new String[inventario.size()];
		String disp [] = new String[inventario.size()];
		for (int j=0;j<inventario.size() ;j++ ) {
			//c1 = agenda.get(j);
			nombres[j] = (inventario.get(j)).producto;
			disp[j] = Integer.toString((inventario.get(j)).stock);

		}
		for (int zz=0;zz<inventario.size() ;zz++ ) {
			almacen += Integer.toString(zz+1);
			almacen += ".-  ";
			almacen += nombres[zz];
			almacen += " Hay disponible: ";
			almacen += disp[zz];
			almacen += "\n";
		}

		return almacen;

	}



}