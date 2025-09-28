import java.io.*;
import java.util.*;

public class P6840 {
	
	static int a, b, c, total[];
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        total = new int[3];
        
        for(int i=0 ; i<3 ; i++) {
        	total[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(total);
        
        sb.append(total[1]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}