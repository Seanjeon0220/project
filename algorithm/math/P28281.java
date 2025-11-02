import java.io.*;
import java.util.*;

public class P28281 {
	
	static int N, X;
	static int[] arr, re;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	X = Integer.parseInt(st.nextToken());
    	
    	arr = new int[N];
    	re = new int[N-1];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	br.close();
    	
    	for(int j=0 ; j<N-1 ; j++) {
    		re[j] = arr[j] + arr[j+1];
    	}
    	
    	Arrays.sort(re);
    	
    	sb.append(re[0]*X);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}


