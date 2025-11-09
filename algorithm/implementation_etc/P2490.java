import java.io.*;
import java.util.*;

public class P2490 {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	for (int i=0 ; i<3 ; i++) {
    		st = new StringTokenizer(br.readLine());
    		int one = 0;
    	
    		for (int j=0 ; j<4 ; j++) {
    			int temp = Integer.parseInt(st.nextToken());
    			if(temp == 1) {
    				one++;
    			}
    		}
    		if(one == 3) {
    			sb.append("A\n");
    		}else if(one == 2) {
    			sb.append("B\n");
    		}else if(one == 1) {
    			sb.append("C\n");
    		}else if(one == 4) {
    			sb.append("E\n");
    		}else {
    			sb.append("D\n");
    		}
    	}
        bw.write(sb.toString());
        bw.flush();
        
    }
}