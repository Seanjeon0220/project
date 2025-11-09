import java.io.*;
import java.util.*;

public class P2501 {
	
	static int N, K;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] total = br.readLine().split(" ");
        N = Integer.parseInt(total[0]);
        K = Integer.parseInt(total[1]);
        
        ArrayList<Integer> num = new ArrayList<>();
        
        for (int i=1; i<=N ; i++) {
        	if (N%i == 0) {
        		num.add(i);
        	}
        }
       
        if (num.size() >= K) {
        	sb.append(num.get(K-1));
        }else {
        	sb.append(0);
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
