import java.io.*;

public class P14470 {	
	
	public static int A, B, C, D, E, ans;
	
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringBuilder sb = new StringBuilder();

	        A = Integer.parseInt(br.readLine());
	        B = Integer.parseInt(br.readLine());
	        C = Integer.parseInt(br.readLine());
	        D = Integer.parseInt(br.readLine());
	        E = Integer.parseInt(br.readLine());
	        br.close();
	        
	        if(A<0) {
	        	ans = Math.abs(A*C) + B*E + D;
	        }else {
	        	ans = (B-A)*E;
	        }
	        
	        sb.append(ans);
	        bw.write(sb.toString());
	        bw.flush();
	        bw.close();
	        
	    }
}