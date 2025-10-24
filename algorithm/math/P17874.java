import java.io.*;
import java.util.*;

public class P17874 {
		
	static int T, A, B, a, b;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	T = Integer.parseInt(st.nextToken());
    	A = Integer.parseInt(st.nextToken());
    	B = Integer.parseInt(st.nextToken());
        br.close();
        
        if(T < 2*A) {
        	a = A;
        }else{
        	a = T-A;
        }
        
        if(T < 2*B) {
        	b = B;
        }else{
        	b = T-B;
        }
        
        sb.append(a*b*4);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}


