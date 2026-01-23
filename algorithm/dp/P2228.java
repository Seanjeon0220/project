import java.io.*;
import java.util.*;
 
public class P2228 {
	static int N, M, total[], sum[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()); 
 
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
 
		total = new int[N + 1];
		sum = new int[N + 1];
		int[][] dp = new int[N + 1][M + 1];
 
		for(int i=1; i<N+1; i++){
			total[i] = Integer.parseInt(br.readLine());
			sum[i] = sum[i - 1] + total[i];
		}
 
		for(int i=0; i<N+1; i++){
			for(int j=1; j<M+1; j++){
				dp[i][j] = -3276800;
			}
		}
 
		dp[1][1] = total[1];
 
		for(int i=2; i<N+1; i++){
			for(int j=1; j<M+1; j++){
 
				dp[i][j] = dp[i - 1][j];
 
				int num = j == 1 ? -1 : 0;
 
				for(int k = i-2; k >= num; k--){
					if(k == -1){
						dp[i][j] = Math.max(dp[i][j], sum[i]);
					}
					
					if(k >= 0){
						dp[i][j] = Math.max(dp[i][j], dp[k][j-1] + sum[i] - sum[k+1]);
					}					
 
					
				}												
				
			}
		}
 
		sb.append(dp[N][M]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
 
	}
}