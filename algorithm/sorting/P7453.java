import java.io.*;
import java.util.*;

public class P7453 {
	
	static int N, idx = 0;
	static long ans = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		int[] d = new int[N];
		int[] ab = new int[N*N];
		int[] cd = new int[N*N];
		
		for (int i=0 ; i<N; i++) {
			String[] total = br.readLine().split(" ");
			a[i] = Integer.parseInt(total[0]);
			b[i] = Integer.parseInt(total[1]);
			c[i] = Integer.parseInt(total[2]);
			d[i] = Integer.parseInt(total[3]);
		}
		
		br.close();

		for (int p=0 ; p<N ;p++) {
			for (int q=0 ; q<N ; q++) {
				ab[idx] = a[p] + b[q];
				cd[idx++] = c[p] + d[q];
				
			}
		}
		
		Arrays.sort(ab);;
		Arrays.sort(cd);;
		
		int left = 0, right = N*N-1;
		
		while(left < N*N && right >= 0) {
			if(ab[left] + cd[right] < 0) {
				left++;
			}else if(ab[left] + cd[right] > 0) {
				right--;
			}else {
				long leftcnt = 1, rightcnt = 1;
				while(left+1 < N*N && (ab[left] == ab[left+1])) {
					leftcnt++;
					left++;
				}
				
				while(right > 0 && (cd[right] == cd[right-1])) {
					rightcnt++;
					right--;
				}
				
				ans += leftcnt*rightcnt;
				left++;
			}
		}
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();	
	}
}
