import java.io.*;
import java.util.*;

public class P14652 {
	
	public static int N, M, K;
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        N = Integer.parseInt(st.nextToken());
	        M = Integer.parseInt(st.nextToken());
	        K = Integer.parseInt(st.nextToken());
	        br.close();
	        
	        bw.write(String.valueOf((K / M)+" "+(K - (M * (K / M)))));
	        bw.flush();
	        bw.close();
	        
	    }
}