import java.io.*;
import java.util.*;

public class P25893 {
	
	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		for(int i=0 ; i<N ; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<3 ; j++) {
				int temp = Integer.parseInt(st.nextToken());
				sb.append(temp+" ");
				if(temp >= 10) {
					sum++;
				}
			}
			sb.append("\n");
			if(sum == 0) {
				sb.append("zilch");
			}else if(sum == 1) {
				sb.append("double");
			}else if(sum == 2) {
				sb.append("double-double");
			}else {
				sb.append("triple-double");
			}
			sb.append("\n");
			sb.append("\n");
		}
		br.close();
		
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}