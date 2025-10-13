import java.io.*;
 
public class P2083 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String temp[] = br.readLine().split(" ");
			if(temp[0].equals("#")) {
				break;
			}else {
				String name = temp[0];
				int a = Integer.parseInt(temp[1]);
				int w = Integer.parseInt(temp[2]);
				if(a<=17 && w<80) {
					sb.append(name + " Junior\n");
				}else {
					sb.append(name + " Senior\n");
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}