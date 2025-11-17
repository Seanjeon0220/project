import java.io.*;
 
public class P2609 {
	
	static int N, M;
	
	public static int gcd(int N, int M) {
		while(M != 0) {
			int temp = M;
			M = N%M;
			N = temp;
		}
		return N;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		N = Integer.parseInt(total[0]);
		M = Integer.parseInt(total[1]);
		
		int gcd = gcd(N,M);
		
		sb.append(gcd +"\n"+ N*M/gcd);
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}