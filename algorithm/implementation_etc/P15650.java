import java.io.*;
 
public class P15650 {
 
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int at, int depth) {
		 
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
        
		for (int i = at; i <= N; i++) {
 
			arr[depth] = i;
			dfs(i + 1, depth + 1);
 
		}
	}
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] total = br.readLine().split(" ");
		N = Integer.parseInt(total[0]);
		M = Integer.parseInt(total[1]);
 
		br.close();
		arr = new int[M];
        
		dfs(1, 0);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
 
	}
 
	
}