import java.io.*;
import java.util.*;
 
public class P15474 {
	
	static int N, A, B, C, D, xn, yn, X, Y, ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		br.close();
		
		if(N%A == 0) {
			xn = N/A;
		}else {
			xn = N/A + 1;
		}
		
		if(N%C == 0) {
			yn = N/C;
		}else {
			yn = N/C + 1;
		}
		
		X = xn*B;
		Y = yn*D;
		ans = Math.min(X, Y);
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}