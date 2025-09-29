import java.io.*;

public class P8370 {
	
	static int n1, k1, n2, k2, ans;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total[] = br.readLine().split(" ");
        
        n1 = Integer.parseInt(total[0]);
        k1 = Integer.parseInt(total[1]);
        n2 = Integer.parseInt(total[2]);
        k2 = Integer.parseInt(total[3]);
        
        ans = n1*k1 + n2*k2;
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}