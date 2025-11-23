import java.io.*;
import java.util.*;
 
public class P11047 {
	
	static int N, K, coin[], cnt;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		cnt = 0;
 
		for(int i = N - 1; i >= 0; i--) {
			if(coin[i] <= K) {
				cnt += (K / coin[i]);
				K = K % coin[i];
			}
		}
		
		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}