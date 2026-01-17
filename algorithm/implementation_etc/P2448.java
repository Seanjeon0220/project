import java.io.*;
import java.util.*;

public class P2448 {
	
	static char[][] stars;
	static int N;
	
	public static void star(int r, int c, int N) {
		if (N == 3) {
			stars[r][c] = '*';
			stars[r + 1][c - 1] = stars[r + 1][c + 1] = '*';
			stars[r + 2][c - 2] = stars[r + 2][c - 1] = stars[r + 2][c] = stars[r + 2][c + 1] = stars[r + 2][c + 2] = '*';
			return;
		} else {
			int cut = N / 2;
			star(r, c, cut);
			star(r + cut, c - cut, cut);
			star(r + cut, c + cut, cut);
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();

		stars = new char[N][N * 2 - 1];
		for (int i = 0; i < N; i++) {
			Arrays.fill(stars[i], ' ');
		}
		
		star(0, N-1, N);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2 * N - 1; j++) {
				sb.append(stars[i][j]);
			}
			sb.append('\n');
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	
}