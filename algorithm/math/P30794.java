import java.io.*;
import java.util.*;
 
public class P30794 {
	
	static int N;
	static String check;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		check = st.nextToken();
		br.close();
		
		if(check.equals("miss")) {
			sb.append(0);
		}else if(check.equals("bad")) {
			sb.append(200*N);
		}else if(check.equals("cool")) {
			sb.append(400*N);
		}else if(check.equals("great")) {
			sb.append(600*N);
		}else {
			sb.append(1000*N);
		}
	
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}