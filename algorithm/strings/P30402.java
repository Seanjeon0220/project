import java.io.*;
import java.util.*;

public class P30402 {
	
	public static String check(String[][] total) {
		String ans = "";
		for(int k=0 ; k<15 ; k++) {
			for(int h=0 ; h<15 ; h++) {
				String temp = total[k][h];
				if(temp.equals("w")) {
					ans = "chunbae";
				}else if(temp.equals("b")) {
					ans = "nabi";
				}else if(temp.equals("g")) {
					ans = "yeongcheol";
				}else {
					continue;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[][] = new String[15][15];
		for(int i=0 ; i<15 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0 ; j<15 ; j++) {
				String temp = st.nextToken();
				total[i][j] = temp;
			}
		}
		br.close();
		
		sb.append(check(total));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
