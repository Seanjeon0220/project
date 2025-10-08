import java.io.*;

public class P28691 {
	
	static String word;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		word = br.readLine();
		
		if(word.equals("M")) {
			sb.append("MatKor");
		}else if (word.equals("W")) {
			sb.append("WiCys");
		}else if(word.equals("C")) {
			sb.append("CyKor");
		}else if(word.equals("A")) {
			sb.append("AlKor");
		}else {
			sb.append("$clear");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
