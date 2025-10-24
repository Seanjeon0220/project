import java.io.*;
import java.util.*;

public class P17388 {
	
	static int S, G, H;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		S = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		br.close();
		
		if(S+G+H >= 100) {
			sb.append("OK");
		}else {
			if(S<G && S<H) {
				sb.append("Soongsil");
			}else if(G<S && G<H) {
				sb.append("Korea");
			}else{
				sb.append("Hanyang");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}