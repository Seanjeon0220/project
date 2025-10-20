import java.io.*;
 
public class P11945 {
	
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String temp[] = br.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		for(int i=0 ; i<N ; i++) {
			String ans = "";
			String line = br.readLine();
			for(int j=0 ; j<M ; j++) {
				ans += line.substring(M-j-1, M-j);
			}
			sb.append(ans+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}