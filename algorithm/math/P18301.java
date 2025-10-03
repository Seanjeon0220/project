import java.io.*;
import java.util.*;

public class P18301 {
	
	static int A, B, C, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()); 
    	
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        
        ans = (int)((double)(A+1)*(B+1)/(C+1) - 1);
        
        sb.append(ans);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}