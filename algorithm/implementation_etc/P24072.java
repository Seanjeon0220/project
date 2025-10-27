import java.io.*;
import java.util.*;

public class P24072 {
	
	static int A, B, C;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		br.close();
		
		if(C >= A && B > C) {
			sb.append(1);
		}else {
			sb.append(0);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}