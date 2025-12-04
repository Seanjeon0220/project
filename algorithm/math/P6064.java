import java.util.*;
import java.io.*;

public class P6064 {
	
	static int N;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());

		for (int s = 0; s < N; s++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			boolean check = false;
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;

			for (int i = x; i < (n * m); i += m) {
				if (i % n == y) {
					sb.append(i+1 +"\n");
					check = true;
					break;
				}
			}

			if (!check) {
				sb.append(-1+"\n");

			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}