import java.io.*;

public class P9316 {
	
	static int N;
;	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        br.close();
        
        for(int i=1 ; i<=N ; i++) {
        	sb.append("Hello World, Judge " + i + "!\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
