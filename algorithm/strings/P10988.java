import java.io.*;

public class P10988 {
	
	static String word;
	static int N, check;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        word = br.readLine();
        N = word.length();
        check = 1;
        
        
    	for (int i=0 ; i<N/2 ; i++) {
    		if (word.charAt(i) != word.charAt(N-i-1)) {
    			check = 0;
    		}
    	}
        
                        
        sb.append(check);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}