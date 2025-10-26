import java.io.*;

public class P21612 {
	
	static int B, P;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	B = Integer.parseInt(br.readLine());
    	br.close();
        
    	P = 5*B - 400;
    	sb.append(P+ "\n");
    	
    	if(P > 100) {
    		sb.append(-1);
    	}else if(P < 100) {
    		sb.append(1);
    	}else {
    		sb.append(0);
    	}
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}