import java.io.*;

public class P5525 {
	
	static int N, M, ans = 0, cnt = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		char s[] = br.readLine().toCharArray();
		br.close();

		for(int i=1; i < M - 1; i++) {
		if(s[i - 1] == 'I' && s[i] == 'O' && s[i + 1] == 'I') {
				cnt++;

				if(cnt == N) {
					cnt--;
					ans++;
				}
                i++;
			}
			else {
				cnt = 0;
			}
		}
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}