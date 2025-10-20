import java.io.*;
import java.util.*;
 
public class P13866 {
	
	static int[] total = new int[4];
	static int ans;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ; i<4 ; i++) {
        	int temp = Integer.parseInt(st.nextToken());
        	total[i] = temp;
        }
        br.close();
        
        Arrays.sort(total);
        
        ans = Math.abs((total[0]+total[3])-(total[1]+total[2]));
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
