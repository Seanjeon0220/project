import java.io.*;

public class P15829 {
	
	static int L;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		L = Integer.parseInt(br.readLine());
		String S = br.readLine();
		br.close();
		
		long ans = 0;
		long pow = 1;
		
		for(int i = 0; i < L; i++) {
			ans += ((S.charAt(i) - 96) * pow);
			pow = (pow * 31) % 1234567891;
		}
		
		sb.append(ans % 1234567891);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}