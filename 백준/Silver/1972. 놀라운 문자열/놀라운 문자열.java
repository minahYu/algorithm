import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("*")) break;

            boolean surprising = true;
            int n = s.length();

            for (int i=1; i<n && surprising; i++) {
                HashSet<String> set = new HashSet<>();
                
                for (int j=0; j+i<n; j++) {
                    String pair = s.charAt(j) + "" + s.charAt(j+i);
                    
                    if (!set.add(pair)) {
                        surprising = false;
                        break;
                    }
                }
            }

            if (surprising) {
                System.out.println(s + " is surprising.");
            } else {
                System.out.println(s + " is NOT surprising.");
            }
        }
    }
}
