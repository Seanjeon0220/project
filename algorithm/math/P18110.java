import java.io.*;
import java.util.Arrays;
 
public class P18110 {
	
	static int N, eliminate, sum, total[];
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(); 
		
		N = Integer.parseInt(br.readLine());
		total = new int[N];
		eliminate = (int) (N * 0.15 +0.5);
		sum = 0;
		
		for(int i=0 ; i<N ; i++) {
			total[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(total);
		
		for(int j=eliminate ; j<N-eliminate ; j++) {
			sum += total[j];
		}
		
		int num = N - 2*eliminate;
		double temp = (double) sum / num + 0.5;
		int ans = (int) temp;
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
 
}