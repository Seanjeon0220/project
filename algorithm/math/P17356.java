import java.io.*;

public class P17356 {

	static double A, B, M, mul, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String temp[] = br.readLine().split(" ");
		A = Double.parseDouble(temp[0]);
		B = Double.parseDouble(temp[1]);
		br.close();
		
		M = (B-A)/400;
		mul = Math.pow(10.0, M) + 1;
		ans = 1/mul;
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}