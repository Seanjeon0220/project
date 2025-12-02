import java.io.*;
import java.util.*;
 
public class P1629 {
 
	public static long C;
	
	public static long pow(long A, long exponent) {
		if(exponent == 1) {
			return A % C;
		}
		long temp = pow(A, exponent / 2);
		if(exponent % 2 == 1) {
			return (temp * temp % C) * A % C;
		}
		return temp * temp % C;	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());
		
		sb.append(pow(A,B));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
}