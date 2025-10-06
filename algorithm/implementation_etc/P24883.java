import java.io.*;

public class P24883 {
	
	static String check;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		check = br.readLine();
		br.close();
		
		if(check.equals("N") || check.equals("n")) {
			sb.append("Naver D2");
		}else {
			sb.append("Naver Whale");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
