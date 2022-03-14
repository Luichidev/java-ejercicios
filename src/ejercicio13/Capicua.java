package ejercicio13;

public class Capicua {
	public static void main(String[] args) {
		int num = 232;
		System.out.println(isCapicua(num));
	}
	
	public static boolean isCapicua(int num) {
		String number  = String.valueOf(num);
		StringBuilder stringNum = new StringBuilder(number);
		
		return (stringNum == stringNum.reverse());
	}
}
