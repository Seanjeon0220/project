import java.io.*;

public class P11050{
	
	static int N, K, ans;
	
	public static int factorialcal(int K) {
		int f = 1;
		for(int i=1; i<=K ; i++) {
			f*=i;
		}
		
		return f;
	}
	
	public static int binomialcoeffecient(int N, int K) {
		int ans = 1;
		
		for(int i=N-K+1 ; i<=N ; i++) {
			ans *= i;
		}

		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] total = br.readLine().split(" ");
		br.close();
		N = Integer.parseInt(total[0]);
		K = Integer.parseInt(total[1]);
		
		ans = binomialcoeffecient(N,K) / factorialcal(K);
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}