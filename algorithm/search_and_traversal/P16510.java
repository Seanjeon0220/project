import java.io.*;
import java.util.*;

public class P16510 {
	
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] tasks = new int[N+1];
		
		for(int i = 0; i < N; i++) {
			tasks[i+1] = tasks[i] + Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < M; i++) {
			int time = Integer.parseInt(br.readLine());
			int left = 1;
			int right = N;
			
			while(left <= right) {
				int mid = (left + right) / 2;
				
				if(tasks[mid] > time) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
			sb.append(right+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}
