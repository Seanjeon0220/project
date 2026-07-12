import java.io.*;
import java.util.*;

public class P14425 {
	
	static int N, M, ans;
	static String[] S, C;
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		N = Integer.parseInt(total[0]);
		M = Integer.parseInt(total[1]);
		ans = 0;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i=0 ; i<N ; i++) {
			map.put(br.readLine(), 0);
		}
		
		for (int j=0 ; j<M ; j++) {
			if (map.containsKey(br.readLine())) {
				ans++;
			}
		}
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
 
}