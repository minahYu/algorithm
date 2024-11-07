import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int count = 1;
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				break;
			}
			
			List<String> nameList = new ArrayList<>();
			for(int i=0; i<n; i++) {
				nameList.add(br.readLine());
			}
			
			List<Integer> numberList = new ArrayList<>();
			for(int i=0; i<2*n-1; i++) {
				String[] inputArr = br.readLine().split(" ");
				int num = Integer.parseInt(inputArr[0]);
				if(!numberList.contains(num)) {
					numberList.add(num);
				} else {
					numberList.remove(Integer.valueOf(num));
				}
			}
			
			for(int i=0; i<numberList.size(); i++) {
				sb.append(count).append(" ").append(nameList.get(numberList.get(i)-1)).append("\n");
				count++;
			}
		}
		System.out.println(sb.toString());
	}
}
