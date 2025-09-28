import java.io.*;
import java.util.*;
 
public class P2475 {
	
	static int ans;
  
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		ans = 0;
		
		for (int i=0 ; i<5 ; i++) {
			int temp = Integer.parseInt(st.nextToken());
			ans += temp*temp;	
		}
	
		sb.append(ans%10);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
 
	}
 
	
}