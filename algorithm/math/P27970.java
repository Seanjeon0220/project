import java.io.*;

public class P27970 {
		
static String word;
static char[] total;
static long sum;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        
        long[] pow = new long[100001];
        pow[0] = 1;
        for (int i=1 ; i<100001 ; i++) {
        	pow[i] = pow[i-1]*2;
        	pow[i]%=1000000007;
        }
        
        word = br.readLine();
        int N = word.length();
        for(int i=0 ; i<N;i++) {
        	if (word.charAt(i) == 'O') {
        		sum+=pow[i];
        		sum%=1000000007;
        		
        	}
        }
        
        sb.append(sum);
		bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
                                   
 }
}
