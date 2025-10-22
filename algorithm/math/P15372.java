import java.io.*;
import java.math.*;

public class P15372 {
	
	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		for(int i=0 ; i<N ; i++) {
			BigInteger T = new BigInteger(br.readLine());
			sb.append(T.multiply(T)+"\n");
		}
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}