package ejercicio07;

public class MediaSum {
	public static void main (String[] arg) {
		int[] numbers = {1,2,3,4,5,6};
		System.out.println(averageNum(numbers));
	}
	
	public static int averageNum(int[] numbers) {
		int res = 0;
		
		for(int i=0; i < numbers.length ; i++) {
			res += numbers[i];
		}
		return res/2;
	}
}
