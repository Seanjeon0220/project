import java.io.*;
import java.util.Arrays;

public class P25704{
	
	static int N, P, total[], ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		P = Integer.parseInt(br.readLine());
		br.close();
		total = new int[4];
		
		if(N < 5) {
			total[0] = P;
			total[1] = P;
			total[2] = P;
			total[3] = P;
		}else if(N < 10) {
			total[0] = P - 500;
			total[1] = P;
			total[2] = P;
			total[3] = P;
		}else if(N < 15) {
			total[0] = P - 500;
			total[1] = P * 90 / 100;
			total[2] = P;
			total[3] = P;
		}else if(N < 20) {
			total[0] = P - 500;
			total[1] = P * 90 / 100;
			total[2] = P - 2000;
			total[3] = P;
		}else {
			total[0] = P - 500;
			total[1] = P * 90 / 100;
			total[2] = P - 2000;
			total[3] = P * 75 / 100;
		}
		
		Arrays.sort(total);
		
		ans = total[0];
		
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