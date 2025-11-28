import java.io.*;
import java.util.*;

public class P25487 {
	
	static int function(int a, int b, int c) {
		int temp = Math.min(a, b);
		int ans= Math.min(temp, c);
		return ans;
	}
	
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
                
        for (int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            int ans = function(a,b,c);
            sb.append(ans + "\n");
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}