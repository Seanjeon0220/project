import java.io.*;
import java.util.*;

public class P2346 {
	
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		Deque<int[]> q = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		sb.append("1 ");
		int in = arr[0];
		
		for(int i=1; i<N; i++){
			q.add(new int[] {(i+1), arr[i]});
		}
		
		while(!q.isEmpty()) {
			if(in >0) { 
				for(int i=1; i<in; i++) {
					q.add(q.poll());
				}
				
				int[] nxt = q.poll();
				in = nxt[1];
				sb.append(nxt[0]+" ");
			} 
			else {
				for(int i=1; i<-in; i++	) {
					q.addFirst(q.pollLast());
				}
				
				int[] nxt = q.pollLast();
				in = nxt[1];
				sb.append(nxt[0]+" ");
			}
		}
				
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
}