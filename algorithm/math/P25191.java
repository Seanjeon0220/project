import java.io.*;

public class P25191 {
		
	static int N, A, B, max;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	String total[] = br.readLine().split(" ");
    	br.close();
    	A = Integer.parseInt(total[0]);
    	B = Integer.parseInt(total[1]);
        
    	max = A/2 + B;
    	
    	sb.append(Math.min(max, N));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}


