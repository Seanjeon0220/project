import java.io.*;
import java.util.*;

public class P11866 {
		
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>(); 
        
        for (int i=1 ; i<N+1 ; i++) {
        	q.add(i);
        }
        
        
        
        
        for (int i=0 ; i<N ; i++) {
        	for(int j=0 ; j<K-1 ; j++) {
        		q.add(q.poll());
        	}
        	int m = q.poll();
        	
        	if (i==0) {
        		if(N!=1) {
        			sb.append("<"+m+", ");
        		}else {
        			sb.append("<1>");
        		}
        		
        	}else if (i==N-1) {
        		sb.append(m+">");
        	}else {
        		sb.append(m+", ");
        	}
        }
        
        
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}