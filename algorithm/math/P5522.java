import java.io.*;

public class P5522 {

	static int ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		ans = 0;
		
		for(int i=0 ; i<5 ; i++) {
			int temp = Integer.parseInt(br.readLine());
			ans += temp;
		}
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
