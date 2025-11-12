import java.io.*;

public class P24266 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        
        long ans = n*n*n;
        
        sb.append(ans+"\n"+3);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
