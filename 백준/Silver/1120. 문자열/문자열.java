import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = sc.nextLine().split(" ");
		String A = strArr[0];
		String B = strArr[1];
		
		int count = 51;
		
		if(A.length() == B.length()) {
			count = 0;
			for(int i=0; i<A.length(); i++) {
				if(A.charAt(i) != B.charAt(i)) {
					count++;
				}
			}
		} else {
			String maxLenStr = A.length() > B.length() ? A : B;
			String minLenStr = A.length() < B.length() ? A : B;

			for(int i=minLenStr.length(); i<=maxLenStr.length(); i++) {
				int currentCount = 0;
				int j = i - minLenStr.length();
				for(int z=0; z<minLenStr.length(); z++) {
					if(maxLenStr.charAt(z+j) != minLenStr.charAt(z)) {
						currentCount++;
					}
				}
				j++;
				
				if(count > currentCount) {
					count = currentCount;
				}
			}
		}
		System.out.println(count);
	}
}
