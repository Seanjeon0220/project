import java.io.*;
import java.util.*;
 
public class P1931 {
	
	static int N, time[][];
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		time = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			String total[] = br.readLine().split(" ");
			time[i][0] = Integer.parseInt(total[0]); 
			time[i][1] = Integer.parseInt(total[1]); 
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
 
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
 
}