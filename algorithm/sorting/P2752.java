import java.io.*;
import java.util.*;
 
public class P2752 {
	
	static int total[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
        
    	total = new int[3];
    	
        for(int i=0 ; i<3 ; i++) {
        	int temp = Integer.parseInt(st.nextToken());
        	total[i] = temp;
        }        
    	br.close();
    	
    	Arrays.sort(total);
    	for(int i=0 ; i<3 ; i++) {
        	sb.append(total[i]+" ");
        }
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
