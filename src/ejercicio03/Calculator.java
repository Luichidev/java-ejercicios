package ejercicio03;

public class Calculator {
	public static void main(String[] args) {
		int num01 = 5;
		int num02 = 4;
		String sign = "+";
		
		System.out.println("la suma de " + num01 + " + " + num02 + " es: " + calc(num01, num02, sign));
	}
	
	public static int calc(int num01, int num02, String sign) {
		int res = 0;
		switch(sign) {
			case "+" : res = num01 + num02;
			break;
			case "-" : res = num01 - num02;
			break;
			case "*" : res = num01 * num02;
			break;
			case "/" : res = num01 / num02;
			break;
			case "%" : res = num01 % num02;
			break;
			case "pot" : res = (int) Math.pow(num01, num02);
			break;
		}
		
		
		return res;
	}
}
