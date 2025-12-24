import java.io.*;

public class P15243 {
	
	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		long[] dp = new long[1001];
		dp[0] = 1;
		
		for (int i=2 ; i<1001 ; i++) {
			dp[i] = dp[i-2]*3;
			for (int j = 4 ; i-j>=0 ; j+=2) {
				dp[i] += dp[i-j] *2; 
				dp[i] %= 1000000007;
			}
		}
		
		sb.append(dp[N]);
		
		bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
	}
}