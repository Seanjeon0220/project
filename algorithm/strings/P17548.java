import java.io.*;

public class P17548 {
	
	static String word;
	static int len;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		word = br.readLine();
		br.close();
		
		sb.append("h");
		len = word.length()-2;
		for(int i=0 ; i<2*len ; i++) {
			sb.append("e");
		}
		sb.append("y");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}