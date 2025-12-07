import java.util.*;
import java.io.*;

public class P3793 {
    static String x, y;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	Scanner sc = new Scanner(System.in);
    	
        while (sc.hasNext()) {
            x = sc.next();
            y = sc.next();
            
            dp = new int[x.length() + 1][y.length() + 1];
            sb.append(getLCSLength(x, y) + "\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        sc.close();
    }

    static int getLCSLength(String x, String y) {
        int m = x.length();
        int n = y.length();

        for (int i = 0; i <= m-1; i++) {
            for (int j = 0; j <= n-1; j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }

        return dp[m][n];
    }
}
