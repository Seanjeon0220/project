import java.io.*;
import java.util.*;

public class P24736 {
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         
    	
        for(int i=0 ; i<2; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            
            sb.append(6*A + 3*B + 2*C + D + 2*E+" ");
        }
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}