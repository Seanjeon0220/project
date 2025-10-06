import java.io.*;
import java.util.*;

public class P26307 {
	
	static int H, M, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()); 
    	
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        ans = (H-9)*60 + M;
        
        sb.append(ans);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}