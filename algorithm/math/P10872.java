import java.io.*;

public class P10872 {
	
	static int N;
	
	public static int factorialcal(int N) {
		int ans = 1;
		for(int i=1; i<=N ; i++) {
			ans*=i;
		}
		
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		if(N==0) {
			sb.append(1);
		}else {
			sb.append(factorialcal(N));
		}
			
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
}