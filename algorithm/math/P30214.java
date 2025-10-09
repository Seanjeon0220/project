import java.io.*;

public class P30214 {
	
	static int N, M;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         
        String total[] = br.readLine().split(" ");
        N = Integer.parseInt(total[0]);
        M = Integer.parseInt(total[1]);
        br.close();
        
        if(M%2 == 0) {
        	if(M/2 <= N) {
            	sb.append("E");
            }else {
            	sb.append("H");
            }
        }else {
        	if((M-1)/2 < N) {
        		sb.append("E");
        	}else {
        		sb.append("H");
        	}
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}