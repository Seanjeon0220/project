import java.io.*;

public class P21964 {
	
	static int N;
	static String word, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		word = br.readLine();
		br.close();
		
		ans = word.substring(N-5, N);
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
