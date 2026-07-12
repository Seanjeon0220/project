import java.io.*;
import java.util.*;

public class P11724 {
	
	static int[][] graph = new int[1001][1001];
	static int V;
	static int E;
	static boolean[] visited = new boolean[1001];
	
	public static void dfs(int index) {
		if(visited[index] == true)
			return;
		else {
			visited[index] = true;
			for(int i = 1; i <= V; i++) {
				if(graph[index][i] == 1) {
					dfs(i);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		int a,b;
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine()); 
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			graph[a][b] = graph[b][a] = 1;
		}
		br.close();
		
		int result = 0 ;
		
		for(int i = 1; i <= V; i++) {
			if(visited[i] == false) {
				dfs(i);
				result++;
			}
		}

		sb.append(result);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}