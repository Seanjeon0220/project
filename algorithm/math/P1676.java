import java.io.*;

public class P1676 {
	
	static int N, ans;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        ans = 0;
        
        for(int i=1 ; i<=N; i++) {
        	if(i%125 == 0) {
        		ans+=3;
        	}else if(i%25 == 0) {
        		ans+=2;
        	}else if(i%5 == 0) {
        		ans++;
        	}
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}