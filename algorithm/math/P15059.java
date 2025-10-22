import java.io.*;
import java.util.*;

public class P15059 {
	
	static int[] a = new int[3];
	static int[] b = new int[3];
	static int ans = 0;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0 ; i<3 ; i++) {
        	a[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        
        for(int i=0 ; i<3 ; i++) {
        	b[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        for(int i=0 ; i<3 ; i++) {
        	int temp = b[i] - a[i];
        	if(temp > 0) {
        		ans += temp;
        	}
        }
            
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
