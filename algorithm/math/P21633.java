import java.io.*;

public class P21633 {
	
	static int k;
	static double ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		k = Integer.parseInt(br.readLine());
		br.close();
		
		ans = (double)k/100 + 25; 
		
		if(ans > 2000) {
			sb.append(2000);
		}else if(ans < 100) {
			sb.append(100);
		}else{
			sb.append(ans);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}