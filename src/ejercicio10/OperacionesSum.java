package ejercicio10;

public class OperacionesSum {
	public static void main(String[] args) {
		int n = 5;
		nOperacionesSum(n);
	}
	
	public static void nOperacionesSum(int sizeNumber) {
		int sum = 0;
		String j = "";
		
		for (int i = 1; i <= sizeNumber; i++) {
			j = j + "+" + i;
			System.out.println( (j + "=" + (sum += i)).substring(1));
		}
	}
}
