package ejercicio06;

public class SumArrays {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		System.out.println(arraySum(numbers));
	}
	
	public static int arraySum(int[] numbers) {
		int suma = 0;
		
		for(int i=0; i < numbers.length ; i++) {
			suma += numbers[i];
		}
		return suma;
	}
}
