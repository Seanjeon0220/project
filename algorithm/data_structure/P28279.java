import java.io.*;
import java.util.*;

public class P28279 {
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st; 
		
		N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<>();
		
		while(N-->0) {
			st= new StringTokenizer(br.readLine());
			int  op = Integer.parseInt(st.nextToken());
			
			if (op == 1) {
				int x = Integer.parseInt(st.nextToken());
				dq.addFirst(x);
			}else if(op == 2) {
				int x = Integer.parseInt(st.nextToken());
				dq.addLast(x);
			}else if(op == 3) {
				if(dq.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(dq.pollFirst()+"\n");
				}
			}else if(op == 4) {
				if(dq.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(dq.pollLast()+"\n");
				}
			}else if(op == 5) {
				sb.append(dq.size()+"\n");
			}else if(op == 6) {
				if(dq.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(op == 7) {
				if(dq.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(dq.peekFirst()+"\n");
				}
			}else if(op == 8) {
				if(dq.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(dq.peekLast()+"\n");
				}
		}
		}
		
		bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
	}
}