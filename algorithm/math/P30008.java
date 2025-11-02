import java.util.*;
import java.io.*;

public class P30008 {
	
	static int N, K;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<K ; i++) {
			int temp = Integer.parseInt(st.nextToken());
			double p = temp*100/N;
			
			if(p <= 4) {
				sb.append(1+" ");
			}else if(p <= 11) {
				sb.append(2+" ");
			}else if(p <= 23) {
				sb.append(3+" ");
			}else if(p <= 40) {
				sb.append(4+" ");
			}else if(p <= 60) {
				sb.append(5+" ");
			}else if(p <= 77) {
				sb.append(6+" ");
			}else if(p <= 89) {
				sb.append(7+" ");
			}else if(p <= 96) {
				sb.append(8+" ");
			}else {
				sb.append(9+" ");
			}
		}
		

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}