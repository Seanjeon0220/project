import java.io.*;
import java.util.*;

public class P11549 {
	
	static int N;
	static int cnt = 0;
	static int[] tea = new int[5];
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<5 ; i++) {
        	tea[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0 ; i<5 ; i++) {
        	if(tea[i] == N) {
        		cnt++;
        	}
        }
        
        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
