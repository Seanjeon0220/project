import java.io.*;

public class P13985 {
	
	static int a, b, c;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] temp = br.readLine().split(" ");
		br.close();
		
		a = Integer.parseInt(temp[0]);
		b = Integer.parseInt(temp[2]);
		c = Integer.parseInt(temp[4]);
		
		if(c == a + b) {
			sb.append("YES");
		}else {
			sb.append("NO");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
