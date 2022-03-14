package ejercicio11;

public class ExpoNro {
	public static void main(String[] args) {
		int num = 10;
		int exp = 2;
		System.out.println(num + "^" + exp + "=" + potencia(num, exp));
	}
	
	
	public static float potencia(int num, int exp) {
		float res = 1;
		if(num == 0 || exp == 0) {
			return res;
		}else {
			for (int i = 0; i < Math.abs(exp); i++) {
				res = exp < 0 
						? (float) 1/(num * num) 
						: (float) num * num;
			}
		}
		return res;
	}
}
