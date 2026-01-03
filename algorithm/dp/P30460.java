import java.io.*;
import java.util.*;

public class P30460{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] mx = new int[N + 3];
        int[] arr = new int[N + 3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N + 2; i++) {
            mx[i] = -2000000000;
            if (i <= N)
                arr[i] = Integer.parseInt(st.nextToken());
            else
                arr[i] = 0;
            if (i >= 3)
                mx[i] = Math.max(mx[i], mx[i - 3] + (arr[i - 2] + arr[i - 1] + arr[i]) * 2);
            mx[i] = Math.max(mx[i], mx[i - 1] + arr[i]);
        }
        
        sb.append(mx[N + 2]);
        bw.write(sb.toString());
        
        br.close();
        bw.flush();
        bw.close();
    }
}
