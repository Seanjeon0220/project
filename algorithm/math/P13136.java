import java.io.*;
import java.util.*;

public class P13136{
	
	static double R, C, N;
	static long RCCTV, CCCTV, CCTV;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		R = Double.parseDouble(st.nextToken());
		C = Double.parseDouble(st.nextToken());
		N = Double.parseDouble(st.nextToken());
		br.close();
		
		RCCTV = (long) Math.ceil(R / N);
		CCCTV = (long) Math.ceil(C / N);
		CCTV = RCCTV * CCCTV;
		
		sb.append(CCTV);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}