import java.io.*;

public class P27323 {
	
	static int a, b, ans;
	
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        
        ans = a*b;
       
        sb.append(ans);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}