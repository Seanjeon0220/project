import java.io.*;
import java.util.*;

public class P19698{
	
	static int N, W, H, L, X, Y;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		br.close();
		
		X = W/L;
		Y = H/L;

		sb.append(Math.min(N, X*Y));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
