import java.io.*;
import java.util.*;

public class P1764 {
	
	static int N, M;
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		N = Integer.parseInt(total[0]);
		M = Integer.parseInt(total[1]);
		
		HashMap<String, Boolean> map = new HashMap<>();		
		ArrayList<String> result = new ArrayList<>();
		int cnt = 0;
		
		for (int i=0 ; i<N+M ; i++) {
			String s = br.readLine();
			if(map.containsKey(s)) {
				result.add(s);
				cnt++;
			}else {
				map.put(s, false);
			}
		}
		
		sb.append(cnt+"\n");
		
		Collections.sort(result);
		
		for (int j=0 ; j<result.size(); j++) {
			sb.append(result.get(j)+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
 
}