import java.io.*;
import java.util.*;
 
public class P13118 {
	
	static int[] arr = new int[4];
	static int x, y, r, cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<4 ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		
		for(int j=0 ; j<4 ; j++) {
			if(arr[j] == x) {
				sb.append(j+1);
			}else {
				cnt++;
			}
		}
		
		if(cnt==4) {
			sb.append(0);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}