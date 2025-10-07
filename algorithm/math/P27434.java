import java.io.*;
import java.math.*;

public class P27434 {
	
	static int N;
	
	public static BigInteger fact(int a,int n){
        BigInteger ret=BigInteger.valueOf(a);

        if(a<n){
            int b=(a+n)/2;
            ret=fact(a,b).multiply(fact(b+1,n));
        }
        return ret;
    }
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.valueOf(br.readLine());
        br.close();
        
        BigInteger ans = fact(1,N);
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}