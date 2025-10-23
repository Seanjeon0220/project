import java.io.*;
import java.util.*;

public class P16199 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int y1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int d1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int y2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		
		int age = y2 - y1;
		
		if(y1 == y2) {
			sb.append(age+"\n");
		}else{
			if(m1 > m2) {
				sb.append(age-1 +"\n");
			}else if(m1 == m2){
				if(d1 <= d2) {
					sb.append(age+"\n");
				}else {
					sb.append(age-1 +"\n");
				}
			}else{
				sb.append(age+"\n");
			}
		}
		sb.append(age+1 +"\n");
		sb.append(age+"\n");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}