import java.io.*;
 
public class P11729 {
 
	public static StringBuilder sb = new StringBuilder();
	static int N;
	
	public static void Hanoi(int N, int start, int mid, int to) {
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		
		Hanoi(N - 1, start, to, mid);
		sb.append(start + " " + to + "\n");
    
		Hanoi(N - 1, mid, start, to);
	}
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		br.close();
		
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		Hanoi(N, 1, 2, 3);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
 

 