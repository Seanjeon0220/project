import java.io.*;
import java.util.*;

public class P2164 {
	static int N, last;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(); 
		
		N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0 ; i<N ; i++) {
			q.add(i+1);
		}
		
		for (int i=0 ; i<N-1 ; i++) {
			q.remove();
			q.add(q.poll());
		}
		
		sb.append(q.poll());
		
		bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
	}
}