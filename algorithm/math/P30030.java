import java.io.*;

public class P30030{
	
	static int N, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         
        N = Integer.parseInt(br.readLine());
        br.close();
        
        ans = N*10/11;
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}