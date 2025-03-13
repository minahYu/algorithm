import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<String> serialNums = new ArrayList<>();
		for(int i=0; i<N; i++) {
			String serialNum = br.readLine();
			boolean inList = false;
			
			for(int j=0; j<serialNums.size(); j++) {
				if(serialNum.length() < serialNums.get(j).length()) {
					serialNums.add(j, serialNum);
					inList = true;
					break;
				} else if(serialNum.length() == serialNums.get(j).length()) {
					if(getNumSum(serialNum) < getNumSum(serialNums.get(j))) {
						serialNums.add(j, serialNum);
						inList = true;
						break;
					} else if(getNumSum(serialNum) == getNumSum(serialNums.get(j))) {
						if(serialNum.compareTo(serialNums.get(j)) < 0) {
							serialNums.add(j, serialNum);
							inList = true;
							break;
						}
					}
				}	
			}
			
			if(!inList) {
				serialNums.add(serialNum);
			}
		}
		
		for(int i=0; i<serialNums.size(); i++) {
			System.out.println(serialNums.get(i));
		}
	}
	
	private static int getNumSum(String str) {
		int sum = 0;
		
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				sum += ch - '0';
			}
		}
		
		return sum;
	}
}
