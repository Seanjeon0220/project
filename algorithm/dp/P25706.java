import java.io.*;
import java.util.*;

public class P25706 {	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); 
        int[] top = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            top[i] = Integer.parseInt(st.nextToken());
        }
        
        int [] result = new int[N];
		
		for(int i = N-1; i >= 0; i--) {
			
			int step = i + top[i] + 1;
			
			if(step >= N) {
				result[i] = 1;
			}
			else {
				result[i] = result[step] + 1;
			}
		}
		
		for(int num: result) {
			sb.append(num+ " ");
		}
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}