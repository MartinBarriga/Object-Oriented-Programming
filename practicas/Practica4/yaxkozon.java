import java.util.List;
import java.util.ArrayList;
public class yaxkozon{

	public static void main(String[] args) {
		List<producto> inventario = new ArrayList<producto>();
		cuadros a1;
		carro c1 = new carro();
		carro c2 = new carro();
		carro c3 = new carro();

		producto a = new producto("xbox one slim 1Tb",7000,15);
		inventario.add(a);
		producto b = new producto("Samsung Smart tv 55''",10999,10);
		inventario.add(b);
		producto c = new producto("llanta continental",1119,40);
		inventario.add(c);
		producto d = new producto("Fabuloso complete pino",39,200);
		inventario.add(d);
		producto e = new producto("Pan de muerto grande",79,100);
		inventario.add(e);
		producto f = new producto("Croquetas Pedigree 4kg",209,150);
		inventario.add(f);
		producto g = new producto("Tequila Jose Cuervo 950ml",290,30);
		inventario.add(g);
		producto h = new producto("Juguete Hot Wheels LE",129,150);
		inventario.add(h);
		producto y = new producto("Audifonos panasonic Bluetooth",1100,80);
		inventario.add(y);
		producto z = new producto("Call of Duty Black ops 4 xone",1000,120);
		inventario.add(z);
		

		a1 = new cuadros(c1,c2,c3,inventario);
	}



}