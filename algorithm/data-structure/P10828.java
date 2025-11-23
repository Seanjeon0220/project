import java.io.*;
import java.util.*;

public class P10828 {
		
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        
        Stack<Integer> s = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        
        while (N-->0) {
        	st = new  StringTokenizer(br.readLine());
        	String op = st.nextToken();
        	if (op.equals("push")) {
        		int x = Integer.parseInt(st.nextToken());
        		s.push(x);
        	}else if (op.equals("pop")) {
        		if (s.isEmpty()) {
        			sb.append("-1\n");
        		}else {
        			sb.append(s.pop()+"\n");
        		}
        	}else if (op.equals("size")) {
        		sb.append(s.size()+"\n");
        	}else if(op.equals("empty")){
        		if (s.isEmpty()) {
        			sb.append("1\n");
        		}else {
        			sb.append("0\n");
        		}
        	}else {
        		if(s.isEmpty()) {
        			sb.append("-1\n");
        		}else {
        			sb.append(s.peek()+"\n");
        		}
        	}
        	
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}