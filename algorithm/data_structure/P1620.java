import java.io.*;
import java.util.*;

public class P1620 {
	
	static int N, M;
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		N = Integer.parseInt(total[0]);
		M = Integer.parseInt(total[1]);
		
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();		
		
		for (int i=1 ; i<=N ; i++) {
			String s = br.readLine();
			map1.put(i, s);
			map2.put(s, i);
		}
		
		for (int j=0; j<M; j++) {
			String temp = br.readLine();
			if(49 <= temp.charAt(0) && temp.charAt(0)<=57) {
				sb.append(map1.get(Integer.parseInt(temp))+"\n");
			}else {
				sb.append(map2.get(temp)+"\n");
			}
		}		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
 
}