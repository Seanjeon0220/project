import java.io.*;

public class P29738 {
	
	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		for(int i=1 ; i<=N ; i++) {
			sb.append("Case #"+i+": ");
			int temp = Integer.parseInt(br.readLine());
			if(temp<=25) {
				sb.append("World Finals\n");
			}else if(temp <= 1000) {
				sb.append("Round 3\n");
			}else if(temp <= 4500) {
				sb.append("Round 2\n");
			}else {
				sb.append("Round 1\n");
			}
		}
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}