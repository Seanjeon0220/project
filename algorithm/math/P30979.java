import java.io.*;
import java.util.*;

public class P30979 {
	
	static int T, N, sum = 0;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	T = Integer.parseInt(br.readLine());
    	N = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine());
    	
    	for (int i=0 ; i<N ; i++) {
    		int temp = Integer.parseInt(st.nextToken());
    		sum += temp;
    	}
    	
    	br.close();
    	
    	if(T > sum) {
    		sb.append("Padaeng_i Cry");
    	}else {
    		sb.append("Padaeng_i Happy");
    	}
    	
        	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}