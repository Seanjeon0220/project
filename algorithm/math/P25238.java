import java.io.*;

public class P25238 {
		
	static int A, B, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	
    	String total[] = br.readLine().split(" ");
        br.close();
        A = Integer.parseInt(total[0]);
        B = Integer.parseInt(total[1]);
        ans = A*(100-B)/100;
        
        if(ans >= 100) {
        	sb.append(0);
        }else {
        	sb.append(1);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}