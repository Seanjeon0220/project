import java.io.*;

public class P27866 {	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String word = br.readLine();
        
        int N = Integer.parseInt(br.readLine());
        
        char ans = word.charAt(N-1);
        sb.append(ans);
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}