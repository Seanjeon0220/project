import java.io.*;

public class P2744 {
	
	static String word;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        word = br.readLine();
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}