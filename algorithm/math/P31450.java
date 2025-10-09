import java.io.*;

public class P31450 {
	
	static int N, M;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         
        String total[] = br.readLine().split(" ");
        N = Integer.parseInt(total[0]);
        M = Integer.parseInt(total[1]);
        br.close();
        
        if(N%M == 0) {
        	sb.append("Yes");
        }else {
        	sb.append("No");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}