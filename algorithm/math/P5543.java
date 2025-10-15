import java.io.*;
import java.util.Arrays;
 
public class P5543{
	
	static int ans;
	static int b[], c[];
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	b = new int[3];
    	c = new int[2];
    	
    	for(int i=0 ; i<3; i++) {
    		int temp = Integer.parseInt(br.readLine());
    		b[i] = temp;
    	}
    	
    	for(int i=0 ; i<2; i++) {
    		int temp = Integer.parseInt(br.readLine());
    		c[i] = temp;
    	}
    	br.close();
    	
    	Arrays.sort(b);
    	Arrays.sort(c);
    	ans = b[0] + c[0] - 50;
    	
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
