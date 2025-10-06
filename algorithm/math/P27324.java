import java.io.*;

public class P27324 {
	
	static int N, A, B;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();
		
		A = N/10;
		B = N%10;
		
		if(A==B) {
			sb.append(1);
		}else {
			sb.append(0);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
