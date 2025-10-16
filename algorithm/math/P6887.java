import java.io.*;

public class P6887 {
	
	static double N;
	static int ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());		
		br.close();
		
		ans = (int) Math.sqrt(N);
		
		sb.append("The largest square has side length "+ ans +".");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}