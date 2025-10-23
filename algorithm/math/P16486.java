import java.io.*;

public class P16486 {
	
	static int d1, d2;
	static double ans;
	
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringBuilder sb = new StringBuilder();

	        d1 = Integer.parseInt(br.readLine());
	        d2 = Integer.parseInt(br.readLine());
	        br.close();
	        
	        ans = (2 * d1) + (2 * d2 * Math.floor(Math.PI*1000000)/1000000.0);
	        
	        sb.append(ans);
	        bw.write(sb.toString());
	        bw.flush();
	        bw.close();
	        
	    }
}