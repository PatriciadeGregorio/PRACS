package src;

public class Algoritmo {

	public static boolean[] selecActividadesOrdDecreInicio (int[] c, int[] f) {
		boolean[] s = new boolean[c.length];
		s[0] = true;
		int i = 0;
		int[] indices = {4, 0, 3, 7, 8, 2, 6, 9, 5, 1};
		for (int j=1; j<c.length; j++) {
			if (c[indices[i]] >= f[indices[j]] || c[indices[j]] <= f[indices[i]]) {
				System.out.println(c[indices[i]] + " y " + f[indices[j]]);
				s[j] = true;
				i = j;
			} else {
				System.out.println(f[indices[i]] + " y " + c[indices[j]] + " en else");
				s[j] = false;
			}
		}
		return s
				
				
				
				
				
				
				
				;
	}
}
