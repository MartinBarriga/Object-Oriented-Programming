
import javax.swing.JOptionPane;

public class Ejercicio6{


	public static void main(String []Arg){
		float dolares, pesos;
		while(true)
		{
			String opcion  = JOptionPane.showInputDialog(null, "1.Convertir dolar a pesos \n2.Convertir pesos a dolar\n3.Salir", "Menu de opciones", JOptionPane.QUESTION_MESSAGE);
			if(Integer.parseInt(opcion) == 1)
			{
				dolares  = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la cantidad de dolares: ", "Opcion 1", JOptionPane.QUESTION_MESSAGE));
				pesos = dolares * 20;
				JOptionPane.showMessageDialog(null, "Tus " + dolares + " dolares equivalen a " + pesos + " pesos", "Resultado Opcion 1", JOptionPane.INFORMATION_MESSAGE);

			}
			else if(Integer.parseInt(opcion) == 2)
			{
				pesos = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la cantidad de pesos: ", "Opcion 2", JOptionPane.QUESTION_MESSAGE));
				dolares = pesos/20;
				JOptionPane.showMessageDialog(null, "Tus " + pesos + " pesos equivalen a " + dolares + " dolares", "Resultado Opcion 2", JOptionPane.INFORMATION_MESSAGE);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Hasta la vista chikibeibi! ", "Salir", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
		}
		//System.out.println("Regala a yaxkin una chela");
	}

}

