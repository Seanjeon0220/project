import java.io.*;
import java.util.*;
import java.math.*;

public class P15740 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		BigInteger a = new BigInteger(st.nextToken()); 
		BigInteger b = new BigInteger(st.nextToken());
		
		sb.append((a.add(b)));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}