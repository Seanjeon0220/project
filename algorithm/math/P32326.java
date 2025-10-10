import java.io.*;

public class P32326 {
	
	static int r, g, b, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		r = Integer.parseInt(br.readLine());
		g = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		br.close();
		
		ans = r*3 + g*4 + b*5;
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}

}
