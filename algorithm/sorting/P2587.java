import java.io.*;
import java.util.Arrays;

public class P2587 {
	
	static int num[], sum;
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        num = new int[5];
        sum = 0;
        
        for (int i=0 ; i<5 ; i++) {
        	int temp = Integer.parseInt(br.readLine());
        	num[i] = temp;
        	sum += temp;
        }
        
        Arrays.sort(num);
        
        sb.append(sum/5+"\n"+num[2]);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}