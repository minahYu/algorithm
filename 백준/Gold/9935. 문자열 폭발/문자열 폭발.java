import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        String bomb = br.readLine();
        int bombLen = bomb.length();
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            sb.append(input.charAt(i));
            
            if (sb.length() >= bombLen) {
                boolean isMatch = true;
                for (int j=0; j<bombLen; j++) {
                    if (sb.charAt(sb.length() - bombLen + j) != bomb.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }
                
                if (isMatch) {
                    sb.delete(sb.length() - bombLen, sb.length());
                }
            }
        }
        
        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.toString());
        }
    }
}