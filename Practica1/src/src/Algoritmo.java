package src;

public class Algoritmo {

	public static boolean[] selecActividadesOrdDecreInicio (int[] c, int[] f) {
		boolean[] s = new boolean[c.length];
		s[0] = true;
		int i = 0;
		for (int j=1; j<c.length; j++) {
			if (c[i] >= f[j] || c[j] <= f[i]) {
				s[j] = true;
				i = j;
			} else {
				s[j] = false;
			}
		}
		return caracsol;
	}
}
