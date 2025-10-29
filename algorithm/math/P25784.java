import java.io.*;
import java.util.*;

public class P25784 {
	
	static int a, b, c, total[];

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
        
    	total = new int[3];
    	
    	for(int i=0 ; i<3 ; i++) {
    		int temp = Integer.parseInt(st.nextToken());
    		total[i] = temp;
    	}
        br.close();
        
        Arrays.sort(total);
        
        a = total[2];
        b = total[1];
        c = total[0];
        
        if(a == b+c) {
        	sb.append(1);
        }else if(a == b*c) {
        	sb.append(2);
        }else {
        	sb.append(3);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}