import java.io.*;

public class P28352 {
		
	static int N;
	static long ans = 6;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
        br.close();
        
        for(int i=N ; i>=11 ; i--) {
        	ans *= i;
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

