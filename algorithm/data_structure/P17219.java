import java.io.*;
import java.util.*;

public class P17219 {
	
	static int N, M;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String num[] = br.readLine().split(" ");
		N = Integer.parseInt(num[0]);
		M = Integer.parseInt(num[1]);
		
		HashMap<String, String> map = new HashMap<String, String>(N);
		
		for(int i=0 ; i< N ; i++) {
			String temp[] = br.readLine().split(" ");
			map.put(temp[0], temp[1]);
		}
		
		for(int j=0 ; j<M ; j++) {
			String site = br.readLine();
			String ans = map.get(site);
			sb.append(ans+"\n");
			
		}
		br.close();
		

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}