import java.io.*;
import java.util.*;

public class P12842 {
		
static int N, S, M, total[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(br.readLine());
		total = new int[M];
		int eat = N - S;
        
        for (int i = 0; i < M; i++) {
            total[i] = Integer.parseInt(br.readLine());
        }
        
        int re = 0;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < M; j++) {
                if (i % total[j] == 0) {
                    re++;
                    if (re >= eat) {
                    	sb.append(j+1);
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
