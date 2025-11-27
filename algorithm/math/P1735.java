import java.io.*;

public class P1735 {
	
	static int a, b, c, d, gcd;
	
	public static int getGcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return getGcd(b, a%b);
	}
	
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total1[] = br.readLine().split(" ");
		String total2[] = br.readLine().split(" ");
		
		a = Integer.parseInt(total1[0]);
		b = Integer.parseInt(total1[1]);
		c = Integer.parseInt(total2[0]);
		d = Integer.parseInt(total2[1]);
		
		a=a*d+c*b;
		b=b*d;
		gcd= getGcd(a,b); 
				
		sb.append(a/gcd+" "+b/gcd);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	

}
