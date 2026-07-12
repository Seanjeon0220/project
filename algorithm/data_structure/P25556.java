import java.io.*;
import java.util.*;

public class P25556 {
	static int N, total[];
	static boolean check;
	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    
	public static void checkit(List<Integer> a) {
		check = true;
		
		List<Stack<Integer>> stackList = new ArrayList<>();
		
		for (int i=0 ; i<4; i++) {
			stackList.add(new Stack<>());
			stackList.get(i).push(0);
		}
		
		for (int num : a) {
			boolean isnum = false;
			for (Stack<Integer> integers : stackList) {
				if (num > integers.peek()) {
					integers.push(num);
					isnum = true;
					break;
				}
			}
			
			if(!isnum) {
				check = false;
				break;
			}
		}
		
		if(check) {
			sb.append("YES");
		}else {
			sb.append("NO");
		}
		
	}
	
	
    public static void main(String[] args) throws IOException {
    
        
        N = Integer.parseInt(br.readLine());
        List<Integer> total = new ArrayList<>();
        StringTokenizer st= new StringTokenizer(br.readLine());;
        
        for(int i = 0; i < N; i++) {
            int b = Integer.parseInt(st.nextToken());
            total.add(b);
        }
        
        checkit(total);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}