import java.io.*;
import java.util.*;

public class P8710 {
	
	static int K, W, M;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	K = Integer.parseInt(st.nextToken());
    	W = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
        br.close();
        
        if((W-K)%M == 0) {
        	sb.append((W-K)/M);
        }else {
        	sb.append((W-K)/M + 1);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

