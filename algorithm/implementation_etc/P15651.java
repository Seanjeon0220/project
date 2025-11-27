import java.io.*;
 
public class P15651 {
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
    	String[] total = br.readLine().split(" ");
    	br.close();
		N = Integer.parseInt(total[0]);
		M = Integer.parseInt(total[1]);
 
		arr = new int[M];
        
		dfs(0);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
 
	public static void dfs(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
 
}