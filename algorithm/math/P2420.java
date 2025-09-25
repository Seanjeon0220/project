import java.io.*;

public class P2420 {
	
	static long N, M, ans;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total[] = br.readLine().split(" ");
        br.close();
        
        N = Long.parseLong(total[0]);
        M = Long.parseLong(total[1]);
        
        ans = Math.abs(N-M);

        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }
}