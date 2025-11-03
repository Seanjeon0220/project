import java.io.*;
import java.util.*;

public class P30468 {
	
	static int a, b, c, d, N, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		br.close();
		
		ans = N*4 - (a+b+c+d);
		
		if(ans > 0) {
			sb.append(ans);
		}else {
			sb.append(0);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
