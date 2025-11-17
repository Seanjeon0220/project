import java.io.*;
import java.util.Arrays;

public class P10989{
	
	static int N, num[];
	
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        num = new int[N];
        
        for (int i=0 ; i<N ; i++) {
        	num[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(num);
        
        for (int i=0 ; i<N ; i++) {
        	sb.append(num[i] +"\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}