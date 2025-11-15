import java.io.*;
import java.util.*;

public class P1037 {
	
	static int N, num[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		if(N == 1) {
			sb.append(num[0] * num[0]);
		}else {
			sb.append(num[0] * num[N-1]);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
}