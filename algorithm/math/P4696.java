import java.io.*;

public class P4696 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			double n = Double.parseDouble(br.readLine());
			if(n == 0) {
				break;
			}else{
				double ans = 1+ n + n*n + n*n*n + n*n*n*n;
				sb.append(String.format("%.2f", ans)+"\n");
			}
		}
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}