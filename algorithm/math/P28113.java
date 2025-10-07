import java.io.*;
import java.util.*;

public class P28113{
	
	static int N, A, B;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        br.close();
        
        if(A==B) {
        	sb.append("Anything");
        }else if(A>B) {
        	sb.append("Subway");
        }else {
        	sb.append("Bus");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}