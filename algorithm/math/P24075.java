import java.io.*;
import java.util.*;

public class P24075 {
		
	static int A, B, plus, minus;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	A = Integer.parseInt(st.nextToken());
    	B = Integer.parseInt(st.nextToken());
        br.close();
        
        plus = A + B;
        minus = A - B;
        
        if(plus > minus) {
        	sb.append(plus +"\n" + minus);
        }else {
        	sb.append(minus +"\n" + plus);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

