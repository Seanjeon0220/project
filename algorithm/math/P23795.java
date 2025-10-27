import java.io.*;

public class P23795 {
	
	static int ans = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int temp = Integer.parseInt(br.readLine());
			if(temp == -1) {
				break;
			}else {
				ans += temp;
			}
		}
		br.close();
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
