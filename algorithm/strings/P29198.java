import java.io.*;
import java.util.*;

public class P29198 {
		
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int _ = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String[] total = new String[N];
        
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            char[] charArr = a.toCharArray(); 
            Arrays.sort(charArr); 
            String result = new String(charArr);
            total[i] = result;
        }
        
        Arrays.sort(total);
        String ans="";
        for (int i =0 ; i<K ; i++) {
        	ans+=total[i];
        }
        
        char[] c = ans.toCharArray();
        Arrays.sort(c);
        String fin = new String(c);
        sb.append(fin);
        
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}