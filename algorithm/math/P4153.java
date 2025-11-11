import java.io.*;
import java.util.*;
 
public class P4153 {
	
	public static String rightcheck(int a, int b, int c) {
		
		if(a*a+b*b == c*c || a*a+c*c == b*b || b*b+c*c == a*a) {
			return "right";
		}
		return "wrong";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			 st = new StringTokenizer(br.readLine(), " ");
			 int a = Integer.parseInt(st.nextToken());
			 int b = Integer.parseInt(st.nextToken());
			 int c = Integer.parseInt(st.nextToken());
			 
			 if(a == 0) {
				 break;
			 }else {
				 sb.append(rightcheck(a,b,c) + "\n");
			 }
        }
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}