package ejercicio01;

public class IsPar {
	
	public static void main(String[] args) {
		int number = 4;
		System.out.println(isParThis(number));
	}
	
	public static boolean isParThis(int number) {
		return number % 2 == 0;
	}
}
