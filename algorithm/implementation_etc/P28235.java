import java.io.*;

public class P28235 {
	
	static String word;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		word = br.readLine();
		
		if(word.equals("SONGDO")) {
			sb.append("HIGHSCHOOL");
		}else if (word.equals("CODE")) {
			sb.append("MASTER");
		}else if(word.equals("2023")) {
			sb.append("0611");
		}else {
			sb.append("CONTEST");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
