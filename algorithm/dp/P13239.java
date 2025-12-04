import java.io.*;
import java.util.*;

public class P13239 {
	static int mod = 1000000007;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0 ; i<t ; i++) {
        	int[][] dp = new int[1001][1001];
        	
        	st = new StringTokenizer(br.readLine());
        	
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	dp[0][0] = dp[1][0] = dp[1][1] = 1;
        	
        	for (int j=2; j<=a ; j++) {
        		for (int k=0 ; k<=b ; k++) {
        			if (j==k || k==0) {
        				dp[j][k] = 1;
     
        			}else {
        				dp[j][k] = (dp[j-1][k-1] + dp[j-1][k])%mod;
        			}
        		}
        	}
        	sb.append(dp[a][b]+"\n");	
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
        
	}
}
