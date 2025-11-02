import java.io.*;
import java.util.*;

public class P29790{

	static int N, U, L;
	static boolean nc = false, mc = false;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	U = Integer.parseInt(st.nextToken());
    	L = Integer.parseInt(st.nextToken());
    	br.close();
    	
    	if(N >= 1000) {
    		nc = true;
    	}
    	
    	if(U >= 8000 || L >= 260) {
    		mc = true;
    	}
    	
    	if(nc && mc) {
    		sb.append("Very Good");
    	}else if(nc) {
    		sb.append("Good");
    	}else{
    		sb.append("Bad");
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}