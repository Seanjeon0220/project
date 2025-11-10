import java.io.*;

public class P2903 {
	
	static int N, total[];
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine()); 
        
        total = new int[16];
        
        total[0] = 2;
        
        for (int i=1 ; i<=15 ; i++) {
        	total[i] = (total[i-1]*2)-1;
        }
        
        sb.append(total[N]*total[N]);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}