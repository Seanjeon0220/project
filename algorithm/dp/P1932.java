import java.io.*;
import java.util.*;
 
public class P1932 {
 
	static int[][] arr;
	static Integer[][] dp;
	static int N;
	
	static int find(int depth, int idx) {
		if(depth == N - 1) return dp[depth][idx];
		if (dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
		}
		return dp[depth][idx];
	}
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
 
		arr = new int[N][N];
		dp = new Integer[N][N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
 
		for (int i = 0; i < N; i++) {
			dp[N - 1][i] = arr[N - 1][i];
		}
		
		sb.append(find(0,0));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
 
	}
}