import java.io.*;
import java.util.*;
 
public class P28938 {
	
	static int N, sum;
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        sum = 0;
    	N = Integer.parseInt(br.readLine());
    	StringTokenizer st= new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		int temp = Integer.parseInt(st.nextToken());
    		sum += temp;
    	}
    	br.close();
    	
    	if(sum < 0) {
    		sb.append("Left");
    	}else if(sum > 0) {
    		sb.append("Right");
    	}else {
    		sb.append("Stay");
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
