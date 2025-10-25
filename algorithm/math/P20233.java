import java.io.*;

public class P20233 {
	
	static int a, b, x, y, T, ans1, ans2;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		a = Integer.parseInt(br.readLine());
		x = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		T = Integer.parseInt(br.readLine());
		br.close();
		
		if(T < 30) {
			ans1 = a;
			ans2 = b;
		}else if(T<45) {
			ans1 = a + (T-30)*x*21;
			ans2 = b;
		}else {
			ans1 = a + (T-30)*x*21;
			ans2 = b + (T-45)*y*21;
		}
		
		sb.append(ans1 + " "  + ans2);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
