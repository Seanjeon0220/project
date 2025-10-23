import java.io.*;

public class P15873 {
	
	static int N, ans;
;	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        
        if(N%100 == N) {
        	ans = N%10 + N/10;
        }else if(N%1000 == N) {
        	if(N%10 == 0) {
        		ans = N/100 + 10;
        	}else {
        		ans = N%10 + 10;
        	}
        }else {
        	ans = 20;
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
