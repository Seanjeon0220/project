import java.io.*;
import java.util.*;

public class P1934 {
	
	static int N;
	
	public static int lcm(int a, int b) {
		if(a%b == 0) {
			return b;
		}
		return lcm(b, a%b);
			
	}
	
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		for (int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int ans = a*b/lcm(a,b);
			sb.append(ans+"\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	

}
