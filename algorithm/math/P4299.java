import java.io.*;
import java.util.*;
 
public class P4299 {
	
	static int N, M, W, L;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		br.close();
		
		
		W = (N+M)/2;
		L = (N-M)/2;
		
		if((N+M)%2!=0 || N<M) {
			sb.append(-1);
		}else{
			sb.append(W+" "+L);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}