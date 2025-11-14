import java.io.*;

public class P2675 {
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());        
        
		for (int i = 0; i < N; i++) {
 
			String[] arr = br.readLine().split(" ");
 
			int R = Integer.parseInt(arr[0]);
 
			for (byte val : arr[1].getBytes()) {
				for (int j = 0; j < R; j++) {
					sb.append((char)val);
				}
			}
			sb.append('\n');
		}
	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}