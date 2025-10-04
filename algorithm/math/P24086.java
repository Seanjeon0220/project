import java.io.*;

public class P24086 {
	
	static int A, B, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		br.close();
		
		ans = B - A;
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
