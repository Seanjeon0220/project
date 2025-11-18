import java.io.*;

public class P1436 {
	
	static int N, num, cnt, ans;
	
	public static int sixcheck(int num, int cnt) {
		while(cnt!=N) {
			num++;
			if (String.valueOf(num).contains("666")) {
        		cnt++;
        	}
		}
		return num;
	}
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        
        num = 666;
        cnt = 1;
        
        ans = sixcheck(666, 1);
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}