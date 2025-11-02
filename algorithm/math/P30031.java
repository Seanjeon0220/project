import java.io.*;
import java.util.*;

public class P30031 {
	
	static int N, ans = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		for(int i=0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			
			if(a==136) {
				ans += 1000;
			}else if(a == 142) {
				ans += 5000;
			}else if(a == 148) {
				ans += 10000;
			}else {
				ans += 50000;
			}
			
		}
		
		br.close();
		
		sb.append(ans);		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}