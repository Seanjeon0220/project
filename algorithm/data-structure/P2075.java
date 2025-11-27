import java.io.*;
import java.util.*;

public class P2075 {
		
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0 ; i<N ; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j=0 ; j<N;j++) {
        		int K=Integer.parseInt(st.nextToken());
        		if (pq.size()<N) {
        			pq.add(K);
        		}else if (pq.size()==N) {
        			if (pq.peek()<K) {
        				pq.poll();
        				pq.add(K);
        			}
        		}
        	}
        	
        }
        
        sb.append(pq.peek());
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}