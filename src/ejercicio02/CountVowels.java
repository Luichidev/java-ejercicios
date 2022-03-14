package ejercicio02;

public class CountVowels {
	public static void main(String[] args) {
		String  word = "Esto es una palabra";
		System.out.println(nVowels(word));
	}
	
	public static int nVowels(String word) {
		int count = 0;
		char character;
		for(int i=0; i < word.length(); i++) {
			character = word.toLowerCase().charAt(i); 
			switch(character) {
				case 'a': count++;
				break;
				case 'e': count++;
				break;
				case 'i': count++;
				break;
				case 'o': count++;
				break;
				case 'u': count++;
				break;
			}
		}
		return count;
	}
}
