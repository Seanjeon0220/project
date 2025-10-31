import java.io.*;
 
public class P27918{
	
	static int N, d = 0, p = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		while(true) {
			if(d-p >= 2 || p-d >= 2 || d+p >= N) {
				sb.append(d+ ":" +p);
				break;
			}else {
				String temp = br.readLine();
				if(temp.equals("D")) {
					d++;
				}else {
					p++;
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
}