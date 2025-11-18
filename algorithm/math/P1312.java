import java.io.*;

public class P1312 {
	
	static int a, b, n, ans;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
    	String total[] = br.readLine().split(" ");
    	br.close();
    	a = Integer.parseInt(total[0]);
    	b = Integer.parseInt(total[1]);
    	n = Integer.parseInt(total[2]);
        
        ans = a % b;

        for(int i=0; i<n-1; i++){
            ans *= 10;
            ans %= b;
        }
        ans *= 10;
        
        sb.append(ans/b);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}