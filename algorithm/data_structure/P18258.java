import java.io.*;
import java.util.*;

public class P18258 {
	static int N, last;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st; 
		
		N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			String op = st.nextToken();
			if(op.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				q.add(x);
				last = x;
			}else if(op.equals("pop")) {
				if(q.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(q.remove()+"\n");
				}
			}else if(op.equals("size")) {
				sb.append(q.size()+"\n");
			}else if(op.equals("empty")) {
				if(q.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(op.equals("front")){
				if(q.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(q.peek()+"\n");
				}
			}else if(op.equals("back")) {
				if(q.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(last+"\n");
				}
			}
		}
		
		
		bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
	}
}