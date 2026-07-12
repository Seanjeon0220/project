import java.io.*;
import java.util.*;

public class P7785 {
	
	static int N;
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		
		N = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i=0 ; i<N ; i++) {
			String total[] = br.readLine().split(" ");
			String name = total[0];
			
			if(map.containsKey(name)) {
				map.put(name, map.get(name)+1);
			}else {
				map.put(name, 1);
			}
			
		}
		
		ArrayList<String> total = new ArrayList<>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		      if(entry.getValue() %2 != 0) {
		    	  total.add(entry.getKey());
		      }
		}
		
		Collections.sort(total, Collections.reverseOrder());
		for (int j=0 ; j<total.size(); j++) {
			sb.append(total.get(j)+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
 
}