import java.io.*;
import java.util.*;

public class P11812 {
	static long N;
	static int K, Q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Long.parseLong(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken());
			long y = Long.parseLong(st.nextToken());
			
			long count = 0;
			if (K == 1) {
				if(x<y) {
					count = y-x;
				}else {
					count = x-y;
				}
			}
			else {
				while (x != y) {
					if (x < y) {
						y = (y - 2) / K + 1;
					}
					else {
						x = (x - 2) / K + 1;
					}
					
					count++;
				}
			}			
			
			sb.append(count+"\n");
			
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}