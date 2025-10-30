import java.io.*;

public class P27110{
	
	static int N, A, B, C, ans=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		String[] total = br.readLine().split(" ");
		br.close();
		
		A = Integer.parseInt(total[0]);
		B = Integer.parseInt(total[1]);
		C = Integer.parseInt(total[2]);
		
		ans = ans + Math.min(A, N) + Math.min(B,  N) + Math.min(C,  N);
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}