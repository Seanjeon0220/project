import java.io.*;

public class P24267 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        
        long ans = n*(n-1)*(n-2)/6;
        
        sb.append(ans+"\n"+3);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
