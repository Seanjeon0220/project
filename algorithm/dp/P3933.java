import java.io.*;
import java.util.*;

public class P3933 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int S = (1 << 15); 
        int[][] dp = new int[S][4+1];
        for (int i = 0; i < S; i++) {
            Arrays.fill(dp[i], 0);
        }
        for (int i = 1; i * i < S; i++) {
            dp[i*i][1] = 1;
            for (int j = i*i; j < S; j++) {
                dp[j][2] += dp[j-i*i][1];
                dp[j][3] += dp[j-i*i][2];
                dp[j][4] += dp[j-i*i][3];
            }
        }

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
            	break;
            }

            int ans = 0;
            for (int i = 1; i <= 4; i++) {
                ans += dp[N][i];
            }

            sb.append(ans+"\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
