import java.io.*;
 
public class P2775 {
 
	public static int[][] dp = new int[15][15];
	static int N;
	
	public static void makedp() {
		 
		for (int i = 0; i < 15; i++) {
			dp[i][1] = 1;
			dp[0][i] = i;
		}
 
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			}
		}
	}
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		makedp(); 
		
		N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[k][n]+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
 
}