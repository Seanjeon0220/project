import java.io.*;

public class P20499 {
	
	static int K, D, A;
	static String ans;
	
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringBuilder sb = new StringBuilder();

	        String total[] = br.readLine().split("/");
	        K = Integer.parseInt(total[0]);
	        D = Integer.parseInt(total[1]);
	        A = Integer.parseInt(total[2]);	        
	        br.close();
	        
	        ans = (K+A<D || D==0)? "hasu" : "gosu";
	        
	        sb.append(ans);
	        bw.write(sb.toString());
	        bw.flush();
	        bw.close();
	        
	    }
}