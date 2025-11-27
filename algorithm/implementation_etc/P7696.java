import java.io.*;
import java.util.*;

public class P7696 {
	
	static HashMap<Integer, Integer> d = new HashMap<>();
	
	static boolean[] check = new boolean[10];
	
	
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int idx = 1;
        
        for(int i=1 ; ; i++) {
        	Arrays.fill(check, false);
        	int t = i;
        	boolean f = true;
        	while(t>0) {
        		if(check[t%10]) {
        			f=false;
        			break;
        		}
        		check[t%10]=true;
        		t/=10;
        	}
        	if(f) {
        		d.put(idx, i);
        		idx++;
        	}
        	if(idx==1000001) {
        		break;
        	}
        	
        }
        
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	if (n==0) {
        		break;
        	}else {
        		sb.append(d.get(n)+"\n");
        	}
        	
        }
        
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}