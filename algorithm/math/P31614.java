import java.io.*;

public class P31614 {
	
	static int H, M, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        H = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        br.close();
        
        ans = 60*H + M;
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}