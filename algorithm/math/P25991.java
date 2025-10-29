import java.io.*;
import java.util.*;

public class P25991 {
	
	static int N;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
        N = Integer.parseInt(br.readLine());
        
        double sum = 0d;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-->0) {
            double cur = Double.parseDouble(st.nextToken());
            sum += Math.pow(cur, 3);
        }
        
        sb.append(Math.cbrt(sum));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}