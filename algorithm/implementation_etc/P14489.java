import java.io.*;

public class P14489 {
	
	static int ans, a, b, p;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total[] = br.readLine().split(" ");
        a = Integer.parseInt(total[0]);
        b = Integer.parseInt(total[1]);
        p = Integer.parseInt(br.readLine());
        br.close();
        
        if(a+b < 2*p) {
        	ans = a+b;
        }else{
        	ans = a+b - 2*p;
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}