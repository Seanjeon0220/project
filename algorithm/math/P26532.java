import java.io.*;
import java.util.*;

public class P26532 {
	
	static int a, b;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	a = Integer.parseInt(st.nextToken());
    	b = Integer.parseInt(st.nextToken());
        
    	double temp = (double)a*b / (4840*5);
    	
    	long ans = Math.round(temp + 0.5);
    	
    	sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}