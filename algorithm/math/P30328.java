import java.io.*;

public class P30328 {
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         
        N = Integer.parseInt(br.readLine());
        
        sb.append(N*4000);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}