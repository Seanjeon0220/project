import java.io.*;
 
public class P16600 {
	
	static long N;
	static double temp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Long.parseLong(br.readLine());
		br.close();
		
		temp = Math.sqrt(N);
		
		sb.append(4*temp);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}