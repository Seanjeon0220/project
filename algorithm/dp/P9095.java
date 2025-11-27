import java.io.*;

public class P9095 {
	
	static int dp[] = new int [11];
	static int N;
	
	public static void main(String[] args)   throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		dp[1] =1;
		dp[2]=2;
		dp[3]=4;
		for(int j=4;j<=10;j++) {
			dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
		}
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n] +"\n");
		}
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}