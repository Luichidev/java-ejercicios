package ejercicio05;

public class MayorQue {
	public static void main(String[] args) {
		int num01 = 100;
		int num02 = 170;
		
		System.out.println(moreThan(num01, num02));
	}
	
	
	public static String moreThan(int num01, int num02) {
		return num01 > num02 ? "Si es mayor 😃" : "No es mayor 😢" ;
	}
}
