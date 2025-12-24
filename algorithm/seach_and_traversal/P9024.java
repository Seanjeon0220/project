import java.io.*;
import java.util.*;

public class P9024 {
	static int T, N, K;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        T= Integer.parseInt(br.readLine());

        while (T-->0) {
        	st = new StringTokenizer(br.readLine());
        	N = Integer.parseInt(st.nextToken());
        	K = Integer.parseInt(st.nextToken());
        	st = new StringTokenizer(br.readLine());
        	
        	int[] a = new int[N];
        	
        	for(int i=0 ; i<N ; i++) {
        		a[i] = Integer.parseInt(st.nextToken());
        	}
        	Arrays.sort(a);
        	int first = 0,second=N-1;
        	int diff = a[second] - a[first];
        	int cnt = 1;
        	
        	while (first < second) {
        		int sum = a[first]+a[second];
        		if(sum>K) {
        			second--;
        		}else if(sum<K){
        			first++;
        		}else {
        			first++;
        			second--;
        		}
        		
        		int d = Math.abs(sum-K);
        		if(d==diff) {
        			cnt++;
        		}else if (d<diff) {
        			diff=d;
        			cnt = 1;
        		}
        	}
        	
        	sb.append(cnt+"\n");
        }
        	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}