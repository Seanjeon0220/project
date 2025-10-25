import java.io.*;

public class P19602{
	
	static int S, M, L, ans = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<4 ; i++) {
			ans += i*Integer.parseInt(br.readLine());
		}
		br.close();
		
		if(ans >= 10) {
			sb.append("happy");
		}else{
			sb.append("sad");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}