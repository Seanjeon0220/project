import java.io.*;
import java.util.*;

public class P16928 {
	static int[] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		board = new int[101];
		for (int i = 1; i < board.length; i++) {
			board[i] = i;
		}

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			board[x] = y;
		}
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			board[x] = y;
		}

		
		int result = bfs(1);
		
		sb.append(result);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

	private static int bfs(int startNode) {

		int[] check = new int[101]; 
		Queue<Integer> q = new LinkedList<>();
		q.offer(startNode);
		check[startNode] = 0; 

		while (true) {
			int visitedNum = q.poll();
			for (int i = 1; i < 7; i++) {            	
				int newNode = visitedNum + i;
                

				if (newNode > 100) { 
					continue;
				}
                

				if (check[board[newNode]] == 0) { 
					q.offer(board[newNode]);
					check[board[newNode]] = check[visitedNum] + 1;
				}
				if (board[newNode] == 100) {
					return check[100];
				}
			}

		}

	}

}