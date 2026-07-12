import java.io.*;
import java.util.*;

public class P2606 {

	static boolean[] check;
	static int[][] arr;
	static int count = 0;
	
	static int node, line;
	
	static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
	
		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		
		for(int i = 0 ; i < line ; i ++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			arr[a][b] = arr[b][a] =  1;	
		}
		
			dfs(1);
			
			sb.append(count - 1);
			
			bw.write(sb.toString());
			bw.flush();
			bw.close();
			br.close();
		
		}
	public static void dfs(int start) {
		
		check[start] = true;
		count++;
		
		for(int i = 0 ; i <= node ; i++) {
			if(arr[start][i] == 1 && !check[i])
				dfs(i);
		}
		
	}
	
}