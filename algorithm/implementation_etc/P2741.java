import java.io.*;
 
public class P2741 {
	
	static int N;
  
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=N ; i++) {
			sb.append(i+"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
 
	}
 
	
}