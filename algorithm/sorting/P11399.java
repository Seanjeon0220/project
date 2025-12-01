import java.io.*;
import java.util.*;
 
public class P11399 {
	
	static int N;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
 
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int[] arr = new int[1001]; 
		while (N-- > 0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
 
		int prev = 0;
		int sum = 0;
		
		for (int i = 0; i < 1001; i++) {
			 
			while (arr[i]-- > 0) {
				sum += (i + prev);
				prev += i;
			}
		}
		
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
 
}