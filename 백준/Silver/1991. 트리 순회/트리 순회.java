import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	private static int[] left;
	private static int[] right;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		left = new int[26];
		right = new int[26];

		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int parent = st.nextToken().charAt(0) - 'A';
			char leftCh = st.nextToken().charAt(0);
			char rightCh = st.nextToken().charAt(0);
			
			left[parent] = (leftCh == '.') ? -1 : leftCh - 'A' ;
			right[parent] = (rightCh == '.') ? -1 : rightCh - 'A';	
		}
		
		StringBuilder preSb = new StringBuilder();
		StringBuilder inSb = new StringBuilder();
		StringBuilder postSb = new StringBuilder();
		
		preorder(0, preSb);
		inorder(0, inSb);
		postorder(0, postSb);
		
		System.out.println(preSb.toString());
		System.out.println(inSb.toString());
		System.out.println(postSb.toString());
	}
	
	private static void preorder(int node, StringBuilder sb) {
		if(node == -1) return;
		
		sb.append((char)(node + 'A'));
		preorder(left[node], sb);
		preorder(right[node], sb);
	}
	
	private static void inorder(int node, StringBuilder sb) {
		if(node == -1) return;
		
		inorder(left[node], sb);
		sb.append((char)(node + 'A'));
		inorder(right[node], sb);
	}
	
	private static void postorder(int node, StringBuilder sb) {
		if(node == -1) return;
		
		postorder(left[node], sb);
		postorder(right[node], sb);
		sb.append((char)(node + 'A'));
	}
}
