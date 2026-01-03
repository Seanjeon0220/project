import java.io.*;
import java.util.*;
 
public class P22251{
 
    static int N, K, P, X;
    static int[][] display = {{1, 1, 1, 0, 1, 1, 1},
                            {0, 0, 1, 0, 0, 0, 1},
                            {0, 1, 1, 1, 1, 1, 0},
                            {0, 1, 1, 1, 0, 1, 1},
                            {1, 0, 1, 1, 0, 0, 1},
                            {1, 1, 0, 1, 0, 1, 1},
                            {1, 1, 0, 1, 1, 1, 1},
                            {0, 1, 1, 0, 0, 0, 1},
                            {1, 1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 0, 1, 1}};
    static long ans = 0;
 
    public static void check(int num, int[] x_digit) {
        for(int i = 1; i <= N; i++) {
            if(i == X) continue;
            if(can_reverse(i, x_digit)) ans++;
        }
    }
 
    public static boolean can_reverse(int target, int[] x_digit) {
        int[] target_digit = num_to_digit(target);
 
        int diff_count = 0;
        for(int i = 0; i < K; i++) {
            for(int j = 0; j < 7; j++) {
                if(display[x_digit[i]][j] != display[target_digit[i]][j]) {
                    diff_count++;
                    if(diff_count > P) return false;
                }
            }
        }
        return true;
    }
 
    public static int[] num_to_digit(int x) {
        int[] result = new int[K];
        for(int i = K - 1; i >= 0; i--) {
            result[i] = x % 10;
            x /= 10;
        }
        return result;
    }
    
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
 
 
        int[] x_digit = num_to_digit(X);
        check(0, x_digit);
        sb.append(ans);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
