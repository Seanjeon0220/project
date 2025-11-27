import java.io.*;

public class P1929 {
	
	static int M, N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] total = br.readLine().split(" ");
		M = Integer.parseInt(total[0]);
		N = Integer.parseInt(total[1]);
		
		boolean[] arr = new boolean[N + 1];
		
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i * i <= N; i++) {
			if(!arr[i]) {
				for(int j = i * i; j <= N; j += i) {
					arr[j] = true;
				}
			}
		}
		
		for(int i = M; i <= N; i++) {
			if(!arr[i]) sb.append(i+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}