import java.io.*;
import java.util.*;

public class P17010 {

	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int temp = Integer.parseInt(st.nextToken());
			String check = st.nextToken();
			for(int j=0 ; j<temp ; j++) {
				sb.append(check);
			}
			sb.append("\n");
		}
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}