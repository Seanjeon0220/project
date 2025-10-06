import java.io.*;

public class P24568 {
	
	static int R, S, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        R = Integer.parseInt(br.readLine());
        S = Integer.parseInt(br.readLine());
        br.close();
        
        ans = R*8 + S*3 - 28;
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}