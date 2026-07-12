import java.io.*;
import java.util.*;

public class P12789 {
	static int N, arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st; 
		
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		arr = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = N-1 ;i>=0 ;i--) {
			s1.add(arr[i]);
		}
		
		int now = 1;
		boolean flag = true;
		
		while(true) {
			if(!s2.isEmpty() && s2.peek() == now) {
				s2.pop();
				now++;
			}else if(!s1.isEmpty()) {
				while(!s1.isEmpty()) {
					if(s1.peek()==now) {
						s1.pop();
						now++;
						break;
					}else {
						s2.add(s1.pop());
					}
				}
				
			}else {
				flag=false;
				break;
			}
			if(now==N+1) {
				break;
			}
		}
		
		if(flag) {
			sb.append("Nice");
		}else {
			sb.append("Sad");
		}
		
		
		bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
	}
}