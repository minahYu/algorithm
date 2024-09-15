import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0;
		double total = 0;
		
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String subjectName = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if(!grade.equals("P")) {
				total += getMark(grade) * score;
				sum += score;
			}
		}
		System.out.println(total / sum);
	}
	
	private static double getMark(String grade) {
		switch(grade) {
		case "A+": return 4.5;
		case "A0": return 4.0;
		case "B+": return 3.5;
		case "B0": return 3.0;
		case "C+": return 2.5;
		case "C0": return 2.0;
		case "D+": return 1.5;
		case "D0": return 1.0;
		default: return 0;
		}
	}
}
