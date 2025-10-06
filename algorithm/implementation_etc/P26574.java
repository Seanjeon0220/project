import java.io.*;
import java.util.*;

public class P26574 {
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()); 
    	
        N = Integer.parseInt(st.nextToken());
        
        for(int i=0 ; i<N ; i++) {
        	int temp = Integer.parseInt(br.readLine());
        	sb.append(temp + " " + temp+"\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}