import java.io.*;

public class P29725 {
	
	static String total = new String("");
	static int black = 0, white = 0, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<8 ; i++) {
			String temp = br.readLine();
			total += temp;
		}
		br.close();
		
		for(int i=0 ; i<64 ; i++) {
			char unit = total.charAt(i);
			if(unit == '.' || unit == 'k' || unit == 'K') {
				continue;
			}else if(unit == 'p') {
				black++;
			}else if(unit == 'n') {
				black += 3;
			}else if(unit == 'b') {
				black += 3;
			}else if(unit == 'r') {
				black +=5;
			}else if(unit == 'q') {
				black +=9;
			}else if(unit == 'P') {
				white++;
			}else if(unit == 'N') {
				white += 3;
			}else if(unit == 'B') {
				white += 3;
			}else if(unit == 'R') {
				white +=5;
			}else if(unit == 'Q') {
				white +=9;
			}
		}
		
		ans = white - black;
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}