import java.util.*;
import java.io.*;

public class P11509 {
	static int ans, N, total[];
	
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    ans = 0;
    N = Integer.parseInt(br.readLine());
    total = new int[1000002];

    st = new StringTokenizer(br.readLine());
    
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (total[num + 1] > 0) {
        total[num + 1]--;
      }
      total[num]++;
    }
    
    int M = total.length;
    
    for (int i = 0; i < M; ++i) {
      ans = total[i] > 0 ? ans + total[i] : ans;
    }

    sb.append(ans);
    bw.write(sb.toString());
    br.close();
    bw.flush();
    bw.close();
  }
}