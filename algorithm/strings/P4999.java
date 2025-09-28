import java.io.*;

public class P4999 {
	
	static String n, m;
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		n = br.readLine();
		m = br.readLine();
		N = n.length();
		M = m.length();
		
		if(N>=M) {
			sb.append("go");
		}else {
			sb.append("no");
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
