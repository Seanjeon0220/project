import java.io.*;
import java.util.*;

public class P20976 {
	
	static int num[] = new int[3];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0 ; i<3 ; i++) {
			int temp = Integer.parseInt(st.nextToken());
			num[i] = temp;
		}
		br.close();
		
		Arrays.sort(num);
		
		sb.append(num[1]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}