import java.io.*;

public class P24264 {
	
	static long a, ans;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        a = Long.parseLong(br.readLine());
        long ans = a*a;
        
        sb.append(ans+"\n"+2);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}