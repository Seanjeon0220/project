import java.io.*;
import java.util.*;

public class P25377 {
	
	static int N, ans, total[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		total = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(b-a >= 0) {
				total[i] = b;
			}else {
				total[i] = 1001;
			}
		}
		br.close();
		
		Arrays.sort(total);
		
		if(total[0] < 1001) {
			sb.append(total[0]);
		}else {
			sb.append(-1);
		}
		


		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}