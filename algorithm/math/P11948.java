import java.io.*;
import java.util.Arrays;

public class P11948 {
	
	static int[] science = new int[4];
	static int[] society = new int[2];
	static int ans;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ; i<4 ; i++) {
        	science[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0 ; i<2 ; i++) {
        	society[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        Arrays.sort(science);
        Arrays.sort(society);
        
        ans = science[1] + science[2] + science[3] + society[1]; 
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}