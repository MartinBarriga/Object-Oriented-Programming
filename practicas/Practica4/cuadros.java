import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
public class cuadros{
	
private String opcion;

	public  cuadros(carro a,carro b,carro c,List<producto> productos ){

		while(true){

 		String valor= JOptionPane.showInputDialog(null,"\nBienvenido eliga un carro:"+ "\n1.-Carro del desvergue " + "(" +a.cargacarro() + ")" + "\n2.-Carro del foraneo " +"(" + b.cargacarro() +")" + "\n3.-Carro del prro "+ "(" + c.cargacarro() +")" + "\n4.-Salir de yaxkozon"  ,"Yaxkozon",JOptionPane.QUESTION_MESSAGE);

 		if (valor == null){
 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
 		}

 		 else if (valor.equals("")==true) {
 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
 		}

 		
 		else if(Integer.parseInt(valor)==1){

			 			while(true){

							 String sub = JOptionPane.showInputDialog(null, "\t Submenu" + "\n1.-Mostrar Catalogo" + "\n2.-Agregar Producto" + "\n3.-Seleccionar un producto del carro" + "\n4.-Vaciar carro" + "\n5.-Checkout" + "\n6.-Logout" ,"Seleccione una opcion",JOptionPane.QUESTION_MESSAGE);
							
							 if (sub == null){
			 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
			 		}

			 		 else if (sub.equals("")==true) {
			 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
			 		}


				else  if (Integer.parseInt(sub)==1) {

				 	JOptionPane.showMessageDialog(null,"\tInventario disponible:" + "\n"+ a.store(productos),"Lista de productos",JOptionPane.QUESTION_MESSAGE);
				 	
				 }

				 else if (Integer.parseInt(sub)==2) {
				 	
				 	String producto = JOptionPane.showInputDialog(null,"\tSeleccione un producto:" + "\n"+ a.store(productos),"Agregar al carrito",JOptionPane.QUESTION_MESSAGE);
				 	String cantidad = JOptionPane.showInputDialog(null,"\tIndique la cantidad:","Monto del producto",JOptionPane.QUESTION_MESSAGE);
				 	int it = Integer.parseInt(producto)-1;
				 	int echame = Integer.parseInt(cantidad);
				 	producto po;
				 	po = productos.get(it);
				 	if (po.stock ==0 || po.stock<echame) {

				 		JOptionPane.showMessageDialog(null,"\nNo hay suficiente cantidad de este producto","No hay producto",JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else {
				 	item e = new item(po,echame,it);
				 	a.agregarproducto(e);

				 }}

				 else if (Integer.parseInt(sub)==3) {

				 	if (a.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else{

				 	String otro = JOptionPane.showInputDialog(null,"\tQue desea hacer?" +"\n1.-Agregar cantidad" + "\n2.-Quitar del carrito","que hago prro?",JOptionPane.QUESTION_MESSAGE);

				 		if (otro == null){
				 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
				 		}

				 		 else if (otro.equals("")==true) {
				 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
				 		}

					 	else if (Integer.parseInt(otro)==1) {
					 			String mod = JOptionPane.showInputDialog(null,"\tSeleccione un producto de su carrito:" +"\n" + a.contenido(),"Modificar productos del carro",JOptionPane.QUESTION_MESSAGE);
				 				String monto = JOptionPane.showInputDialog(null,"\tCuanto mas quieres agregar?","Agregar producto",JOptionPane.QUESTION_MESSAGE);
				 				int ss = Integer.parseInt(mod);
				 				int pk = Integer.parseInt(monto);
				 				item xxx = a.getitem(ss);
				 				int mas = xxx.lista;
				 				int mon = (productos.get(mas)).stock;
				 					if (mon ==0 || mon<pk) {

				 					JOptionPane.showMessageDialog(null,"\nNo hay suficiente cantidad de este producto","No hay producto",JOptionPane.WARNING_MESSAGE);
				 		
				 					
				 					}
				 					else
				 					xxx.agregar(productos,pk);

					 	}

					 	else if (Integer.parseInt(otro)==2) {

					 		String devo =  JOptionPane.showInputDialog(null,"\tQue producto desea quitar de su carrito?" + "\n" + a.contenido(),"quitar productos",JOptionPane.QUESTION_MESSAGE);
					 		int lu = Integer.parseInt(devo);
					 		item xx = a.getitem(lu);
					 		xx.devolucion(productos);
					 		a.quitarproducto(lu);

					 	}
				 	
				 }}


				 else if (Integer.parseInt(sub)==4) {

				 	if (a.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else{

				 	JOptionPane.showMessageDialog(null,"\nDejaste el carrito y fuiste por otro vacio :v","Vaciar carrito",JOptionPane.QUESTION_MESSAGE);
				 	for (int m=0;m<=a.cargacarro() ;m++ ) {

				 		item oz = a.getitem(1);
				 		oz.devolucion(productos);
				 		a.quitarproducto(1);
				 		
				 	}}
				 	//a.vaciarcarro();
				 }

				 else if (Integer.parseInt(sub)==5) {

				 	if (a.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else{

				 	JOptionPane.showMessageDialog(null,"\tSe ha generado su tikect" + "\n" + a.tikect(),"Total a pagar",JOptionPane.QUESTION_MESSAGE);
				 	a.vaciarcarro();
				 	
				 }}

				 else if (Integer.parseInt(sub)==6) {
				 	
				 	JOptionPane.showMessageDialog(null,"\tRegresando a la seleccion de carro","Logout",JOptionPane.QUESTION_MESSAGE);
				 	break;

				 }

			}}

			else if(Integer.parseInt(valor)==2){

			
					while(true){

						 String sub = JOptionPane.showInputDialog(null, "\t Submenu" + "\n1.-Mostrar Catalogo" + "\n2.-Agregar Producto" + "\n3.-Seleccionar un producto del carro" + "\n4.-Vaciar carro" + "\n5.-Checkout" + "\n6.-Logout" ,"Seleccione una opcion",JOptionPane.QUESTION_MESSAGE);
						 if (sub == null){
		 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
		 		}

		 		 else if (sub.equals("")==true) {
		 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
		 		}
				 
				 else if (Integer.parseInt(sub)==1) {

				 	JOptionPane.showMessageDialog(null,"\tInventario disponible:" + "\n"+ b.store(productos),"Lista de productos",JOptionPane.QUESTION_MESSAGE);
				 	
				 }

				 else if (Integer.parseInt(sub)==2) {
				 	
				 	String producto = JOptionPane.showInputDialog(null,"\tSeleccione un producto:" + "\n"+ b.store(productos),"Agregar al carrito",JOptionPane.QUESTION_MESSAGE);
				 	String cantidad = JOptionPane.showInputDialog(null,"\tIndique la cantidad:","Monto del producto",JOptionPane.QUESTION_MESSAGE);
				 	int it = Integer.parseInt(producto)-1;
				 	int echame = Integer.parseInt(cantidad);
				 	producto po;
				 	po = productos.get(it);
				 	if (po.stock ==0 || po.stock<echame) {

				 		JOptionPane.showMessageDialog(null,"\nNo hay suficiente cantidad de este producto","No hay producto",JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else {
				 	item e = new item(po,echame,it);
				 	b.agregarproducto(e);

				 }}

				 else if (Integer.parseInt(sub)==3) {

				 	if (b.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else {

				 	String otro = JOptionPane.showInputDialog(null,"\tQue desea hacer?" +"\n1.-Agregar cantidad" + "\n2.-Quitar del carrito","que hago prro?",JOptionPane.QUESTION_MESSAGE);
					 	if (Integer.parseInt(otro)==1) {
					 			String mod = JOptionPane.showInputDialog(null,"\tSeleccione un producto de su carrito:" +"\n" + b.contenido(),"Modificar productos del carro",JOptionPane.QUESTION_MESSAGE);
				 				String monto = JOptionPane.showInputDialog(null,"\tCuanto mas quieres agregar?","Agregar producto",JOptionPane.QUESTION_MESSAGE);
				 				int ss = Integer.parseInt(mod);
				 				int pk = Integer.parseInt(monto);
				 				item xxx = b.getitem(ss);
				 					int mas = xxx.lista;
				 				int mon = (productos.get(mas)).stock;
				 					if (mon ==0 || mon<pk) {

				 					JOptionPane.showMessageDialog(null,"\nNo hay suficiente cantidad de este producto","No hay producto",JOptionPane.WARNING_MESSAGE);
				 		
				 					
				 					}
				 					else
				 					xxx.agregar(productos,pk);

					 	}
					 	

					 	else if (Integer.parseInt(otro)==2) {

					 		String devo =  JOptionPane.showInputDialog(null,"\tQue producto desea quitar de su carrito?" + "\n" + b.contenido(),"quitar productos",JOptionPane.QUESTION_MESSAGE);
					 		int lu = Integer.parseInt(devo);
					 		item xx = b.getitem(lu);
					 		xx.devolucion(productos);
					 		b.quitarproducto(lu);

					 	}
				 	
				 }}


				 else if (Integer.parseInt(sub)==4) {

				 	if (b.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else{

				 	JOptionPane.showMessageDialog(null,"\nDejaste el carrito y fuiste por otro vacio :v","Vaciar carrito",JOptionPane.QUESTION_MESSAGE);
				 		for (int m=0;m<=b.cargacarro() ;m++ ) {

				 		item oz = b.getitem(1);
				 		oz.devolucion(productos);
				 		b.quitarproducto(1);
				 		
				 	}
				 	
				 }}

				 else if (Integer.parseInt(sub)==5) {

				 	if (b.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else {

				 	JOptionPane.showMessageDialog(null,"\tSe ha generado su tikect" + "\n" + b.tikect(),"Total a pagar",JOptionPane.QUESTION_MESSAGE);
				 	b.vaciarcarro();
				 	
				 }}

				 else if (Integer.parseInt(sub)==6) {
				 	
				 	JOptionPane.showMessageDialog(null,"\tRegresando a la seleccion de carro","Logout",JOptionPane.QUESTION_MESSAGE);
				 	break;

				 }

			}

			}

			else if(Integer.parseInt(valor)==3){

				while(true){

				 String sub = JOptionPane.showInputDialog(null, "\t Submenu" + "\n1.-Mostrar Catalogo" + "\n2.-Agregar Producto" + "\n3.-Seleccionar un producto del carro" + "\n4.-Vaciar carro" + "\n5.-Checkout" + "\n6.-Logout" ,"Seleccione una opcion",JOptionPane.QUESTION_MESSAGE);

						 if (sub == null){
		 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
		 		}

		 		 else if (sub.equals("")==true) {
		 			JOptionPane.showMessageDialog(null,"Por favor, Ingresa una opcion valida", "Opcion Invalida" ,JOptionPane.INFORMATION_MESSAGE);
		 		}
				else  if (Integer.parseInt(sub)==1) {

				 	JOptionPane.showMessageDialog(null,"\tInventario disponible:" + "\n"+ c.store(productos),"Lista de productos",JOptionPane.QUESTION_MESSAGE);
				 	
				 }

				 else if (Integer.parseInt(sub)==2) {
				 	
				 	String producto = JOptionPane.showInputDialog(null,"\tSeleccione un producto:" + "\n"+ c.store(productos),"Agregar al carrito",JOptionPane.QUESTION_MESSAGE);
				 	String cantidad = JOptionPane.showInputDialog(null,"\tIndique la cantidad:","Monto del producto",JOptionPane.QUESTION_MESSAGE);
				 	int it = Integer.parseInt(producto)-1;
				 	int echame = Integer.parseInt(cantidad);
				 	producto po;
				 	po = productos.get(it);
				 		if (po.stock ==0 || po.stock<echame) {

				 		JOptionPane.showMessageDialog(null,"\nNo hay suficiente cantidad de este producto","No hay producto",JOptionPane.WARNING_MESSAGE);
				 		
				 		}

				 		else {
				 		item e = new item(po,echame,it);
				 		c.agregarproducto(e);

					 }}

				 else if (Integer.parseInt(sub)==3) {

				 	if (c.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else{

				 	String otro = JOptionPane.showInputDialog(null,"\tQue desea hacer?" +"\n1.-Agregar cantidad" + "\n2.-Quitar del carrito","que hago prro?",JOptionPane.QUESTION_MESSAGE);
					 	if (Integer.parseInt(otro)==1) {
					 			String mod = JOptionPane.showInputDialog(null,"\tSeleccione un producto de su carrito:" +"\n" + c.contenido(),"Modificar productos del carro",JOptionPane.QUESTION_MESSAGE);
				 				String monto = JOptionPane.showInputDialog(null,"\tCuanto mas quieres agregar?","Agregar producto",JOptionPane.QUESTION_MESSAGE);
				 				int ss = Integer.parseInt(mod);
				 				int pk = Integer.parseInt(monto);
				 				item xxx = c.getitem(ss);
				 					int mas = xxx.lista;
				 				int mon = (productos.get(mas)).stock;
				 					if (mon ==0 || mon<pk) {

				 					JOptionPane.showMessageDialog(null,"\nNo hay suficiente cantidad de este producto","No hay producto",JOptionPane.WARNING_MESSAGE);
				 		
				 					
				 					}
				 					else
				 					xxx.agregar(productos,pk);

					 	}

					 	else if (Integer.parseInt(otro)==2) {

					 		String devo =  JOptionPane.showInputDialog(null,"\tQue producto desea quitar de su carrito?" + "\n" + c.contenido(),"quitar productos",JOptionPane.QUESTION_MESSAGE);
					 		int lu = Integer.parseInt(devo);
					 		item xx = c.getitem(lu);
					 		xx.devolucion(productos);
					 		c.quitarproducto(lu);

					 	}
				 	
				 }}


				 else if (Integer.parseInt(sub)==4) {

				 	if (c.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else{

				 	JOptionPane.showMessageDialog(null,"\nDejaste el carrito y fuiste por otro vacio :v","Vaciar carrito",JOptionPane.QUESTION_MESSAGE);
				 		for (int m=0;m<=c.cargacarro() ;m++ ) {

				 		item oz = c.getitem(1);
				 		oz.devolucion(productos);
				 		c.quitarproducto(1);
				 		
				 	}
				 	//c.vaciarcarro();
				 }}

				 else if (Integer.parseInt(sub)==5) {

				 	if (c.cargacarro()==0) {

				 		JOptionPane.showMessageDialog(null,"\t\tNo disponible con carro vacio","Error", JOptionPane.WARNING_MESSAGE);
				 		
				 	}

				 	else{

				 	JOptionPane.showMessageDialog(null,"\tSe ha generado su tikect" + "\n" + c.tikect(),"Total a pagar",JOptionPane.QUESTION_MESSAGE);
				 	c.vaciarcarro();
				 	
				 }}

				 else if (Integer.parseInt(sub)==6) {
				 	
				 	JOptionPane.showMessageDialog(null,"\tRegresando a la seleccion de carro","Logout",JOptionPane.QUESTION_MESSAGE);
				 	break;

				 }

			}
				
			}

			else if(Integer.parseInt(valor)==4){

				 JOptionPane.showMessageDialog(null,"Hasta luego ", "Cerrando sesion" ,JOptionPane.INFORMATION_MESSAGE);
				 break;
				


			}
			

			}




	}


	}
