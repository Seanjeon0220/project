import java.io.*;

public class P10987 {
	
	static String word;
	static int N, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		word = br.readLine();
		br.close();
		
		N = word.length();
		ans = 0;
		
		for(int i=0 ; i<N ; i++) {
			char temp = word.charAt(i);
			if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
				ans ++;
			}
		}

		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}