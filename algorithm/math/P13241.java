import java.io.*;

public class P13241 {
	
	public static long lcm(long a, long b) {
		if(a%b == 0) {
			return b;
		}
		return lcm(b, a%b);
			
	}
	
	static long a, b ;
	
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		
		a = Long.parseLong(total[0]);
		b = Long.parseLong(total[1]);
		
		long ans = a*b/lcm(a,b);
		sb.append(ans+"\n");
		

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	

}
