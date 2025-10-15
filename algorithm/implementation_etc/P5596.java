import java.io.*;
import java.util.Arrays;
 
public class P5596 {
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        int[] n = {0,0};
    	
        for(int i=0 ; i<2 ; i++) {
        	String total[] = br.readLine().split(" ");
        	for(int j=0 ; j<4 ; j++) {
        		n[i] += Integer.parseInt(total[j]);
        	}
        }
    	br.close();
    	
    	Arrays.sort(n);
    	
    	sb.append(n[1]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
