package ejercicio04;

public class ElMayor {
	public static void main(String[] args) {
		int num01 = 100;
		int num02 = 170;
		int num03 = 30;
		
		System.out.println(max(num01, num02, num03));
	}
	
	public static int max(int num01, int num02, int num03) {
		int res = 0;
		res = Math.max(num01, num02);
		res = Math.max(res, num03);
		return res;
	}
}
