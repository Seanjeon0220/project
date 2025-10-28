import java.io.*;
import java.util.*;
 
public class P25600 {
	
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int score;
			
			if(a == d+g) {
				score = 2* a * (d+g);
			}else{
				score = a * (d+g);
			}
			
			arr[i] = score;
		}
		
		Arrays.sort(arr);
		
		sb.append(arr[arr.length-1]);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
}