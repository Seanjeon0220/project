import java.io.*;

public class P28074 {
	
	static String word;
	static int M = 0, O = 0, B = 0, I = 0, S = 0; 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		word = br.readLine();
		br.close();
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'M') {
				M = 1;
			}else if(word.charAt(i) == 'O') {
				O = 1;
			}else if(word.charAt(i) == 'B') {
				B = 1;
			}else if(word.charAt(i) == 'I') {
				I = 1;
			}else if(word.charAt(i) == 'S') {
				S = 1;
			}
		}
		
		if(M == 1 && O == 1 && B == 1 && I == 1 && S == 1) {
			sb.append("YES");
		}else {
			sb.append("NO");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}