import java.io.*;
import java.util.*;

public class P8674 {
	
	static long N, M;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());
        br.close();
        
        if(N%2 != 0 && M%2 !=0) {
        	sb.append(Math.min(N, M));
        }else {
        	sb.append(0);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

