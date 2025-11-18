import java.io.*;

public class P11653 {
	
	static int N;
	
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        
        for (int i=2; i<=N; i++) {
        	while(N%i==0) {
        		N/=i;
        		sb.append(i+"\n");
        	}
        }
       
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}