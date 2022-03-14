package ejercicio08;

import java.util.Arrays;

public class MaxMin {
	public static void main(String[] arg) {
		int[] numbers = {3,56,6,7,10,45,34};
		
		System.out.println("El valor minimo y máximos del array " + Arrays.toString(numbers) + " son: " + Arrays.toString(maxMinValue(numbers)));
	}
	
	
	public static int[] maxMinValue(int[] numbers) {
		Arrays.sort(numbers);
		int [] res = {numbers[0], numbers[numbers.length - 1]};	
		return res;
	}
}
