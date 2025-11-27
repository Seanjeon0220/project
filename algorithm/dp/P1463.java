import java.io.*;

public class P1463 {
	
	static int N, ans;
	
	public static int check(int N, int count) {
		if (N < 2) {
			return count;
		}
		return Math.min(check(N / 2, count + 1 + (N % 2)), check(N / 3, count + 1 + (N % 3)));
 
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        
        ans = check(N,0);
        
        sb.append(ans);
                
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}