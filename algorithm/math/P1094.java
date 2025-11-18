import java.io.*;

public class P1094 {
	
	static int N, stick = 64, cnt = 0;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		br.close();

		while (N > 0) {
			if (stick > N) {
				stick /= 2;

			} else {
				N -= stick;
				cnt++;
			}
		}

		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}