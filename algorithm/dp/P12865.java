import java.io.*;

public class P12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        int[][] item = new int[N + 1][2];

        for (int i = 1; i <= N; i++) {
            inputs = br.readLine().split(" ");
            item[i][0] = Integer.parseInt(inputs[0]);
            item[i][1] = Integer.parseInt(inputs[1]);
        }
        br.close();

        int[][] dp = new int[N + 1][K + 1];

        for (int k = 1; k <= K; k++) {
            for (int i = 1; i <= N; i++) {
                dp[i][k] = dp[i - 1][k];
                if (k - item[i][0] >= 0) {
                    dp[i][k] = Math.max(dp[i - 1][k], item[i][1] + dp[i - 1][k - item[i][0]]);
                }
            }
        }
        sb.append(dp[N][K]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}