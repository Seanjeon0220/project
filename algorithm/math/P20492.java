import java.io.*;

public class P20492 {
	
	static int N, a1, a2;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();
		
		a1 = N / 1000 * 780;
		
		a2 = N / 1000 * 956;
		
		
		sb.append(a1+ " " + a2);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}	

}
