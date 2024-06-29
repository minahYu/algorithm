import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		
		String str = br.readLine();
		for(char ch : str.toCharArray()) {
			left.push(ch);
		}
		
		int M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch(command) {
			case "L":
				if(!left.isEmpty())
					right.push(left.pop());
				break;
			case "D":
				if(!right.isEmpty())
					left.push(right.pop());
				break;
			case "B":
				if(!left.isEmpty())
					left.pop();
				break;
			case "P":
				left.push(st.nextToken().charAt(0));
				break;
			}
		}
		while(!right.isEmpty()) {
			left.push(right.pop());
		}
		
		for(char ch : left) {
			bw.write(ch);
		}
		bw.flush();
		bw.close();
	}
}
