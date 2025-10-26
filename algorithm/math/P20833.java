import java.io.*;

public class P20833 {
	
	static int N, ans = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=1 ; i<=N ; i++) {
			ans += i*i*i;
		}
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}