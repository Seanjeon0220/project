import java.io.*;
import java.util.*;

public class P25494{
	
	static int N, num[], cnt, len;
	
	public static int check(int[] num) {
		cnt = 0;
		len = num[0];
		
		for(int i=1 ; i<=len ; i++) {
			for(int j=1 ; j<=len ; j++) {
				for(int k=1 ; k<=len ; k++) {
					if(i%j == j%k && j%k== k%i) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			num = new int[3];
			st = new StringTokenizer(br.readLine());
			num[0] = Integer.parseInt(st.nextToken());
			num[1] = Integer.parseInt(st.nextToken());
			num[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(num);
			sb.append(check(num)+"\n");
		}
		br.close();

		bw.write(sb.toString());
		bw.flush();
		bw.close(); 
	}
}