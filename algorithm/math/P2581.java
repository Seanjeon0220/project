import java.io.*;
import java.util.*;

public class P2581 {
	
	static int M, N, sum, ini;
	
	public static boolean pmcheck(int i) {
		int temp = 0;
		
		for (int k=1; k<=i ; k++) {
			if(i%k==0) {
				temp++;
			}
		}
		
		if(temp==2) {
			return true;
		}else {
			return false;
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> ans = new ArrayList<>();
        
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        
        for (int i=M ; i<=N ; i++) {
        	if (pmcheck(i)) {
        		ans.add(i);
        	}
        }
        
        int s = ans.size();
        
        if (s == 0) {
        	sb.append(-1);
        }else{
        	sum=0;
            for (int j=0; j<s; j++) {
            	sum += ans.get(j);
            }
            ini = ans.get(0);
            sb.append(sum+"\n"+ini);
            
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}