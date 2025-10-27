import java.io.*;
import java.util.*;
 
public class P22015 {
	
	static int A, B, C, temp, max, ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		br.close();
		
		temp = Math.max(A, B);
		max = Math.max(temp, C);
		ans = max*3 - (A+B+C);
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}