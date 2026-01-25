import java.io.*;
import java.util.*;

public class P13325 {

	static int N, K, res;
	static int[] total, tree;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
		
		K = Integer.parseInt(br.readLine());
		
		N = (int)Math.pow(2, K+1)-1;
		total = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=2; i<=N; i++) {
			total[i] =Integer.parseInt(st.nextToken());
		}
		
		dfs(1,0);
		
		sb.append(res);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int dfs(int idx, int check) {
		if(check == K) {
			res += total[idx];
			return total[idx];
		}
		int L =  dfs(idx*2, check+1);
		int R = dfs(idx*2+1, check+1);
		
		res += total[idx]+Math.abs(L-R);
		return total[idx]+Math.max(L, R);
	}
}