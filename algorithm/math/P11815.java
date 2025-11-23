import java.io.*;
import java.util.*;

public class P11815 {
	
	static int N;
	
	public static int determination(long a) {
		long temp = (long) Math.sqrt(a); 
		if(temp*temp == a) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			long temp = Long.parseLong(st.nextToken());
			sb.append(determination(temp)+" ");
		}
		
		bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
	}
}