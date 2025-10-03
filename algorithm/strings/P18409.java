import java.io.*;

public class P18409 {
	
	static int N, cnt;
	static String S;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		S = br.readLine();
		cnt = 0;
		br.close();
		
		for(int i=0 ; i<N ; i++) {
			if(S.charAt(i) == 'a' || S.charAt(i) == 'i' || S.charAt(i) == 'u' || S.charAt(i) == 'e' || S.charAt(i) == 'o') {
				cnt++;
			}
		}
		
		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
