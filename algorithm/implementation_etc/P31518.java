import java.io.*;
import java.util.*;

public class P31518 {
	
	static int N, ans = 0;
	static boolean checkone=false, checktwo=false, checkthree=false;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int j=0 ; j<N ; j++) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp == 7) {
				checkone = true;
				break;
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int j=0 ; j<N ; j++) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp == 7) {
				checktwo = true;
				break;
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int j=0 ; j<N ; j++) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp == 7) {
				checkthree = true;
				break;
			}
		}
		br.close();
		
		if(checkone && checktwo && checkthree) {
			sb.append(777);
		}else{
			sb.append(0);
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
