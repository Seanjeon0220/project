import java.io.*;

public class P27890 {
	
	static int A, B;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		A = Integer.parseInt(total[0]);
		B = Integer.parseInt(total[1]);
		br.close();
		
		for(int i = 0; i < B; i++) {
			if(A % 2 == 0) {
				A = A / 2 ^ 6;
			}else {
				A = (2 * A) ^ 6;
			}
		}
		
		sb.append(A);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}