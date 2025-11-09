import java.io.*;
import java.util.*;

public class P2566 {
    static int num, max, x, y;
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        max = 0;
        x = 1;
        y = 1;
        
        
        for (int i=1 ; i<10 ; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for (int j=1 ; j<10 ; j++) {
        		num = Integer.parseInt(st.nextToken());
        		
        		if (num>max) {
        			max = num;
        			x = i;
        			y = j;
        		}
        	}
        	
        }
        
        sb.append(max+ "\n");
        
        sb.append(x + " "+ y);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}