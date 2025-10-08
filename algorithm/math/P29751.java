import java.io.*;

public class P29751 {
	
	static int A,B;
	static double ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		br.close();
		
		A= Integer.parseInt(total[0]);
		B = Integer.parseInt(total[1]);

		ans = (double)A*B/2;
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
