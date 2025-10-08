import java.io.*;

public class P29699 {
	
	static int N, idx;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String word = "WelcomeToSMUPC";
        N = Integer.parseInt(br.readLine());
        br.close();
      
        if(N%14 == 0) {
        	sb.append('C');
        }else {
        	sb.append(word.charAt(N%14 - 1));
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}