import java.io.*;
import java.util.*;

public class P28278 {
	
	static int N;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		
		N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stk = new Stack<>();
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			
			if(op==1) {
				int x = Integer.parseInt(st.nextToken());
				stk.add(x);
			}else if(op==2){
				if(stk.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(stk.pop()+"\n");
				}
			}else if(op==3) {
				sb.append(stk.size()+"\n");
			}else if(op==4) {
				if(stk.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(op==5) {
				if(stk.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(stk.peek()+"\n");
				}
				
			}
		}
		
		bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
	}
}