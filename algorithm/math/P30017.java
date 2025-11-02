import java.io.*;
import java.util.*;

public class P30017 {
	
	static int A, B, C, ans, cnt = 3;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	A = Integer.parseInt(st.nextToken());
    	B = Integer.parseInt(st.nextToken());
    	br.close();
    	
    	A -= 2;
    	B -= 1;
    	
    	C = Math.min(A, B);
    	ans = cnt+2*C;
    	
    	sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}