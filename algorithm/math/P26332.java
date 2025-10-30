import java.io.*;

public class P26332 {
	
	static int n, c, p;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		for (int i=0 ; i<n ; i++) {
			String[] temp = br.readLine().split(" ");
			c = Integer.parseInt(temp[0]);
			p = Integer.parseInt(temp[1]);
			
			sb.append(c + " " + p + "\n");
			
			if(c == 1) {
				sb.append(p+"\n");
			}else {
				sb.append(c*p - 2*(c-1)+"\n");
			}
			
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
}
