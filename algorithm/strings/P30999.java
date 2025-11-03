import java.io.*;

public class P30999 {
	
	static int N, M, sum = 0;
	
	public static boolean check(String vote, int m) {
		int num = 0;
		int standard;
		if(m%2 == 0) {
			standard = m/2;
		}else {
			standard = m/2 + 1;
		}
		
		for(int i=0 ; i<m ; i++) {
			char c = vote.charAt(i);
			if(c == 'O') {
				num++;
			}
		}
		if(num >= standard) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String temp[] = br.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		for(int i=0 ; i<N ; i++) {
			String vote = br.readLine();
			if(check(vote, M)) {
				sum ++;
			}
		}
		
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
