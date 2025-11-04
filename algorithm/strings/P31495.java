import java.io.*;

public class P31495 {
	
	static String sen;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sen = br.readLine();
		if(sen.charAt(0) == '"' && sen.charAt(sen.length()-1)=='"' && sen.length() != 2 && sen.length() != 1) {
			String ans = sen.substring(1,sen.length()-1);
			sb.append(ans);
		}else{
			sb.append("CE");
		}
		
		br.close();


		bw.write(sb.toString());
		bw.flush();
		bw.close(); 
	}
}