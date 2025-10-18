import java.io.*;
 
public class P10768 {
	
	static int M, D;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
    	M = Integer.parseInt(br.readLine());
    	D = Integer.parseInt(br.readLine());
    	br.close();
    	
    	if(M>2) {
    		sb.append("After");
    	}else if(M<2) {
    		sb.append("Before");
    	}else {
    		if(D > 18) {
    			sb.append("After");
    		}else if(D < 18) {
    			sb.append("Before");
    		}else {
    			sb.append("Special");
    		}
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
