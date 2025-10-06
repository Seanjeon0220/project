import java.io.*;

public class P25372 {
	
	static int N;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			String temp = br.readLine();
			if(temp.length()>=6 && temp.length() <=9) {
				sb.append("yes"+"\n");
			}else {
				sb.append("no"+"\n");
			}
		}		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
