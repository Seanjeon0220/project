import java.io.*;
import java.util.*;

public class P2238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

        int _ = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        List<String>[] p = new ArrayList[10001];
        for (int i = 0; i < 10001; i++) {
            p[i] = new ArrayList<>();
        }
        int[] num = new int[10001];
        int m = 10001;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            p[price].add(name);
            num[price]++;
        }

        for (int i = 0; i < 10001; i++) {
            if (num[i] != 0) {
                m = Math.min(num[i], m);
            }
        }

        for (int i = 0; i < 10001; i++) {
            if (m == num[i]) {
                sb.append(p[i].get(0) + " " + i);
                break;
            }
        }
        
		bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();

    }
}
