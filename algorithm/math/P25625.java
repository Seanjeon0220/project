import java.io.*;
import java.util.*;

public class P25625 {
	
	static int x, y, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		br.close();
		
		if(x>y) {
			ans = x+y;
		}else {
			ans = y-x;
		}
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close(); 
	}
}