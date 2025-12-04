import java.io.*;

public class P1052{	
	
	static int N, K;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total[] = br.readLine().split(" ");
        N = Integer.parseInt(total[0]);
        K = Integer.parseInt(total[1]);
        
        int ans = 0;

        while (Integer.bitCount(N) > K) {
            ans += N & (-N);
            N += N & (-N);
        }
        
        sb.append(ans);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}