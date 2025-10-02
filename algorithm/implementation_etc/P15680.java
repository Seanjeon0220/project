import java.io.*;

public class P15680 {
	
	static int N;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();
		
		if(N==0) {
			sb.append("YONSEI");
		}else {
			sb.append("Leading the Way to the Future");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
