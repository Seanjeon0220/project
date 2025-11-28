import java.io.*;
 
public class P17626 {
	
	static int N;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        br.close();
 
        int[] dp = new int[N + 1];
        dp[1] = 1;
 
        int min = 0;
        for (int i = 2; i <= N; i++) {
            min = Integer.MAX_VALUE;
           
            for (int j = 1; j * j <= i; j++) {
                int temp = i - j * j;
                min = Math.min(min, dp[temp]);
            }
 
            dp[i] = min + 1;
        }
        sb.append(dp[N]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}