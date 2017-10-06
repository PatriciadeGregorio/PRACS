package src;

public class Main {
	public static void main (String[] args){
		Algoritmo a = new Algoritmo ();
		int[] c = {7, 24, 11, 5, 0, 12, 23, 2, 16, 15};
		int[] f = {8, 29, 21, 11, 3, 25, 24, 18, 20, 24};
		boolean[] resultado = a.selecActividadesOrdDecreInicio(c, f);
		for (int i = 0; i < resultado.length; i++){
			
			System.out.println(i + " " + resultado[i]);
		}
	}
}
