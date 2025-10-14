import java.io.*;
import java.util.*;

public class P4589 {

	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		sb.append("Gnomes:\n");
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a>b && b>c) {
				sb.append("Ordered\n");
			}else if(a < b && b < c) {
				sb.append("Ordered\n");
			}else {
				sb.append("Unordered\n");
			}
		}
		br.close();

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}