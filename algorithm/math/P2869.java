import java.io.*;

public class P2869 {
	
	static long A, B, V, D;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] total = br.readLine().split(" ");
        
        A = Long.parseLong(total[0]);
        B = Long.parseLong(total[1]);
        V = Long.parseLong(total[2]);
        
        long destination = V - B;
		long dist = A - B;

		long div = destination / dist;
		long mod = destination % dist;

		long D = div;
		if(mod != 0) {
			D = D + 1;
			sb.append(D);
		}
		else {
			sb.append(D);
		}
		
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
