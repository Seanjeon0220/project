import java.io.*;
import java.util.*;

public class P25628 {
	
	static int A, B, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		br.close();
		
		ans = Math.min(A/2, B);
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}