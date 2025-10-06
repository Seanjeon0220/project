import java.io.*;

public class P26545 {
	
	static int N, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        N = Integer.parseInt(br.readLine());
        ans = 0;
        for(int i=0 ; i<N ; i++) {
        	int temp = Integer.parseInt(br.readLine());
        	ans += temp;
        }
        br.close();
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}