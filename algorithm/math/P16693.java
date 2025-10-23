import java.io.*;

public class P16693 {
	
	static double a, p, r, q;
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total1[] = br.readLine().split(" ");
		String total2[] = br.readLine().split(" ");
		
		a = Double.parseDouble(total1[0]);
		p = Double.parseDouble(total1[1]);
		r = Double.parseDouble(total2[0]);
		q = Double.parseDouble(total2[1]);
		br.close();
		
		double x=a/p, y=Math.PI*r*r/q;
		
		if(x<y) {
			sb.append("Whole pizza");
		}else {
			sb.append("Slice of pizza");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}