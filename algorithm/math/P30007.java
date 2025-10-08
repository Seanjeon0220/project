import java.io.*;

public class P30007 {
	
	static int N;
	
	public static int check(int A, int B, int X) {
		int ans = A*(X-1)+ B;
		return ans;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			String total[] = br.readLine().split(" ");
			int A = Integer.parseInt(total[0]);
			int B = Integer.parseInt(total[1]);
			int X = Integer.parseInt(total[2]);
			sb.append(check(A,B,X)+"\n");
		}	
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
