import java.io.*;
import java.util.*;

public class P10813 {	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] initial = new int[N];
        
        for (int i=0 ; i<N ; i++) {
        	initial[i] = i+1;
        }
        
        for (int i=0 ; i<M ; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            int temp = initial[a];
            initial[a] = initial[b];
            initial[b] = temp;
        }
        
        for (int num : initial) {
            sb.append(num).append(" ");
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}