import java.io.*;
import java.util.*;

public class P18691 {
		
	static int N;
	
	public static int check(int g, int c, int e) {
		int temp = e-c;
		
		if(temp < 0) {
			return 0;
		}
		
		if(g == 1) {
			return temp * 1;
		}else if(g == 2) {
			return temp * 3;
		}else {
			return temp * 5;
		}
	}
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		int G = Integer.parseInt(st.nextToken());
    		int C = Integer.parseInt(st.nextToken());
    		int E = Integer.parseInt(st.nextToken());
    		sb.append(check(G, C, E) + "\n");
    				
    	}
        br.close();
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

