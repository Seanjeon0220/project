import java.io.*;
import java.util.*;

public class P25932 {
	
	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		for (int i=0 ; i<N ; i++) {
			int c1 = 0, c2 = 0;
			st = new StringTokenizer(br.readLine());
			for (int j=0 ; j<10 ; j++){
				int temp = Integer.parseInt(st.nextToken());
				sb.append(temp + " ");
				if(temp == 17) {
					c1 = 1;
				}
				
				if(temp == 18) {
					c2 = 1;
				}
			}
			
			sb.append("\n");
			
			if(c1==1 && c2 == 1) {
				sb.append("both\n\n");
			}else if(c1 == 1) {
				sb.append("zack\n\n");
			}else if(c2 == 1) {
				sb.append("mack\n\n");
			}else {
				sb.append("none\n\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
