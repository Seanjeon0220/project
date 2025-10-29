import java.io.*;
import java.util.*;

public class P25828 {
	
	static int g, p, t, I, G;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		g = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		br.close();
		
		I = g*p;
		G = g + p*t;
		
		if(I > G) {
			sb.append(2);
		}else if(I < G) {
			sb.append(1);
		}else {
			sb.append(0);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}