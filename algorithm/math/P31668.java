import java.io.*;

public class P31668 {

	static int N, M, K, num, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	M = Integer.parseInt(br.readLine());
    	K = Integer.parseInt(br.readLine());
    	br.close();
    	
    	num = M/N;
    	ans = num*K;
    	
    	sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}