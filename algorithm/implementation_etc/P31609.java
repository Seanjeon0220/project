import java.io.*;
import java.util.*;

public class P31609{
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	N = Integer.parseInt(br.readLine());
    	int temp[] = new int[N];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		temp[i] = Integer.parseInt(st.nextToken());
    	}
    	br.close();
    	
    	Arrays.sort(temp);
    	temp = Arrays.stream(temp).distinct().toArray();
    	
    	for(int j=0 ; j<temp.length ; j++) {
    		sb.append(temp[j]+"\n");
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}