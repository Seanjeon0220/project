import java.io.*;
import java.util.Arrays;

public class P25305 {
	
	static int N, K, cnt, num[];
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total[] = br.readLine().split(" ");
        String numtemp[] = br.readLine().split(" ");
        N = Integer.parseInt(total[0]);
        K = Integer.parseInt(total[1]);
        cnt = N-K;
        num = new int[N];
        
        for(int i=0 ; i<N ; i++) {
        	num[i] = Integer.parseInt(numtemp[i]);
        }
        
        Arrays.sort(num);
        sb.append(num[cnt]);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}