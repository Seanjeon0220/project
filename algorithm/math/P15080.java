import java.io.*;

public class P15080 {
	
	static int a, b, c, d, e, f, X, Y, ans;
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total1[] = br.readLine().split(" : ");
		String total2[] = br.readLine().split(" : ");
		
		a = Integer.parseInt(total1[0]);
		b = Integer.parseInt(total1[1]);
		c = Integer.parseInt(total1[2]);
		d = Integer.parseInt(total2[0]);
		e = Integer.parseInt(total2[1]);
		f = Integer.parseInt(total2[2]);
		br.close();
		
		X = 3600*a + 60*b + c;
		Y = 3600*d + 60*e + f;
		
		ans = Y-X;
		
		if(ans > 0) {
			sb.append(Y-X);
		}else {
			sb.append(ans+86400);
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}