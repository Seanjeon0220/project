import java.io.*;

public class P17362 {
	
	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();
		
		if(N % 8 == 0) {
			sb.append(2);
		}else if(N % 4 == 3) {
			sb.append(3);
		}else if(N % 8 == 6) {
			sb.append(4);
		}else {
			sb.append(N%8);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}