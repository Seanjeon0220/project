import java.io.*;
import java.util.*;

public class P16678 {
	static int N, total[];
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
		
        N = Integer.parseInt(br.readLine());
		long sum = 0;
		
		total = new int[N];
		
		for(int i = 0; i < N; i++)
			total[i] = Integer.parseInt(br.readLine());

		Arrays.sort(total);
		if(total[0] != 1) {
			sum += (total[0] - 1);
			total[0] = 1;
		}

		for(int i = 1; i < N; i++) {
			if(total[i] > total[i-1]) {
				sum += total[i] - (total[i-1] + 1);
				total[i] = total[i-1]+1;
				
			}				
		}
		sb.append(sum);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}