import java.io.*;
import java.util.*;

public class P17845 {
	static int N, K, total[], A[], B[];
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        total = new int[N + 1];

        A = new int[K + 1];
        B = new int[K + 1];

        for(int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            B[i] = a;
            A[i] = b;
        }

        for(int i = 1; i <= K; i++) {
            int cost = A[i];
            int rigor = B[i];
            for(int j = N; j >= 1; j--) {
                if(cost <= j) {
                    total[j] = Math.max(total[j], total[j - cost] + rigor);
                }
            }
        }
        
        sb.append(total[N]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}