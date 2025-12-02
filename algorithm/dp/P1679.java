import java.io.*;
import java.util.*;

public class P1679 {
		
static int N, K, total[], maxA, check[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        
		N = Integer.parseInt(br.readLine());
		total = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			total[i] = Integer.parseInt(st.nextToken());
			maxA = Math.max(maxA, total[i]);
		}
		
		K = Integer.parseInt(br.readLine());
		
		check = new int[maxA * K + 1 + 1];
		for (int i=1; i<check.length; i++) {
			check[i] = Integer.MAX_VALUE;
			for (int j=0; j<N; j++) {
				if (total[j] <= i) {
					check[i] = Math.min(check[i], check[i-total[j]] + 1);
				}
			}
			if (check[i] > K) {
				if (i % 2 == 0) {
					sb.append("holsoon");
				}
					
				else {
					sb.append("jjaksoon");
				}
				sb.append(" win at ");
				sb.append(i);
				bw.write(sb.toString());
				bw.flush();
		        br.close();
		        bw.close();
				return;
			}
		}	
	}
}
