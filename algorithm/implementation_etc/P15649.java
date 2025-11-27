import java.io.*;

public class P15649 {
 
	public static int[] arr;
	public static boolean[] visit;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String total[] = br.readLine().split(" ");
		br.close();
		
		N = Integer.parseInt(total[0]);
		M = Integer.parseInt(total[1]);

		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
 
	}
}