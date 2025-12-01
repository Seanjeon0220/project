import java.io.*;
import java.util.*;

public class P18870 {
		
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
       
        int N = Integer.parseInt(br.readLine());
        int[] total = new int[N];
        int[] temp = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for (int i=0; i<N ; i++) {
        	total[i] = Integer.parseInt(st.nextToken());
        	temp[i] = total[i];
        }
        
        Arrays.sort(temp);
        HashMap<Integer, Integer> h = new HashMap<>();
        int K=-1, prev = Integer.MAX_VALUE;
        
        for (int i=0 ; i<N ; i++) {
        	if (prev!=temp[i]) {
        		K++;
        		h.put(temp[i],K);
        		prev = temp[i];
        	}
        }
        
        for (int i =0 ; i<N ; i++) {
        	sb.append(h.get(total[i])+" ");
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}