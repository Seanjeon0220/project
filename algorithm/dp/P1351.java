import java.io.*;
import java.util.*;

public class P1351 {

	static Map<Long, Long> map = new HashMap<>();
	static int p,q;
	
	static long solve(long num) {
		
		if(num==0) return 1;
		if(map.containsKey(num)) return map.get(num);
		
		long a= (long)Math.floor(num/p);
		long b= (long)Math.floor(num/q);
		
		map.put(num, solve(a)+solve(b));
		return map.get(num);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		long n = Long.parseLong(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		br.close();
		
		sb.append(solve(n));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}