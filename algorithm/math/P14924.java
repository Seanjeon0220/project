import java.io.*;

public class P14924 {
	
	static int S, T, D, ans;
	
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringBuilder sb = new StringBuilder();

	        String total[] = br.readLine().split(" ");
	        S = Integer.parseInt(total[0]);
	        T = Integer.parseInt(total[1]);
	        D = Integer.parseInt(total[2]);	        
	        br.close();
	        
	        ans = D/(2*S) * T;
	        
	        sb.append(ans);
	        bw.write(sb.toString());
	        bw.flush();
	        bw.close();
	        
	    }
}