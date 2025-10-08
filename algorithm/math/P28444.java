import java.io.*;
import java.util.*;

public class P28444 {
	
	static int H, I, A, R, C, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        H = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        br.close();
        
        ans = H*I - A*R*C;
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}