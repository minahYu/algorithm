import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		final String ACCEPTABLE = "is acceptable.";
		final String NOT_ACCEPTABLE = "is not acceptable.";
		
		String password = "";
		while(!(password = br.readLine()).equals("end")) {
			boolean possible = isPasswordAcceptable(password);
			
			String result = possible ? ACCEPTABLE : NOT_ACCEPTABLE;
			sb.append("<").append(password).append("> ");
			sb.append(result).append("\n");
		}	
		System.out.println(sb.toString());	
	}
	
	private static boolean isPasswordAcceptable(String password) {
		if(!containsVowel(password)) {
			return false;
		}
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		for(int i=0; i<password.length(); i++) {
			char currentChar = password.charAt(i);
			
			if(isVowel(currentChar)) {
				vowelCount++;
				consonantCount = 0;
			} else {
				consonantCount++;
				vowelCount = 0;
			}
			
			if(vowelCount > 2 || consonantCount > 2) {
				return false;
			}
			
			if(i > 0 && currentChar == password.charAt(i-1)) {
				if(currentChar != 'e' && currentChar != 'o') {
					return false;
				}	
			}
		}
		return true;
	}
	
	private static boolean containsVowel(String password) {
		for(char vowel : VOWELS) {
			if(password.indexOf(vowel) >= 0) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isVowel(char ch) {
		for(char vowel : VOWELS) {
			if(vowel == ch) {
				return true;
			}
		}
		return false;
	}
}
