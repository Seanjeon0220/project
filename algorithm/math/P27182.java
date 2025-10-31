import java.io.*;
import java.util.*;

public class P27182 {
	
	static int n, m;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		br.close();
		
		if (n > 7) {
			sb.append(n-7);
		}else {
			sb.append(m+7);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
