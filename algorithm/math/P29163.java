import java.io.*;
import java.util.*;
 
public class P29163 {
	
	static int N, sum, E,O;
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        sum = 0;
    	N = Integer.parseInt(br.readLine());
    	StringTokenizer st= new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		int temp = Integer.parseInt(st.nextToken());
    		if(temp % 2 == 0) {
    			E++;
    		}else {
    			O++;
    		}
    	}
    	br.close();
    	
    	if(E>O) {
    		sb.append("Happy");
    	}else{
    		sb.append("Sad");
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
