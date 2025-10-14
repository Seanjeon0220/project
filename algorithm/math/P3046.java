import java.io.*;
 
public class P3046 {
	
	static int R1, S, R2;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total[] = br.readLine().split(" ");    	
        br.close();
    	
        R1 = Integer.parseInt(total[0]);
        S = Integer.parseInt(total[1]);
    	
    	R2 = 2*S - R1;
    	
    	sb.append(R2);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
