import java.io.*;

public class P1028 {
    static final int MAXR = 750 + 5;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] RC = br.readLine().split(" ");
        int R = Integer.parseInt(RC[0]);
        int C = Integer.parseInt(RC[1]);
        
        int ans = 0;
        int[][] arr = new int[MAXR][MAXR];
        int[][] rcache = new int[MAXR][MAXR];
        int[][] lcache = new int[MAXR][MAXR];

        for (int i = 1; i <= R; i++) {
            String line = br.readLine();
            for (int j = 1; j <= C; j++) {
                arr[i][j] = line.charAt(j - 1) - '0'; 
            }
        }

        for (int i = R; i >= 1; i--) {
            for (int j = C; j >= 1; j--) {
                if (arr[i][j] == 0) continue;
                rcache[i][j] = rcache[i + 1][j + 1] + arr[i][j];
            }
        }

        for (int i = R; i >= 1; i--) {
            for (int j = C; j >= 1; j--) {
                if (arr[i][j] == 0) continue;
                lcache[i][j] = lcache[i + 1][j - 1] + arr[i][j];
            }
        }

        for (int len = 375; len >= 0; len--) {
            for (int i = 1; i <= R; i++) {
                if (i + 2 * len - 2 <= R) {
                    for (int j = 1; j <= C; j++) {
                        if (j - len + 1 >= 1 && j + len - 1 <= C) {
                            if (rcache[i][j] >= len && lcache[i + len - 1][j + len - 1] >= len && lcache[i][j] >= len && rcache[i + len - 1][j - len + 1] >= len) {
                                sb.append(len + " ");
                                bw.write(sb.toString());
                                bw.flush(); 
                                br.close();
                                bw.close();
                                return;
                            }
                        }
                    }
                }
            }
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush(); 
        br.close();
        bw.close();
    }
}
